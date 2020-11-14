package org.devio.hi.json;

public class HiJson {
    private Object target;

    public HiJson(String jsonString) {
        if (jsonString.startsWith("[")) {
            try {
                this.target = new JSONArray(jsonString);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            try {
                this.target = new JSONObject(jsonString);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public HiJson(JSONObject jsonObject) {
        this.target = jsonObject;
    }

    public <T> T value() {
        try {
            return (T) target;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public <T> T value(String name) {
        try {
            if (target instanceof JSONObject) {
                return (T) ((JSONObject) target).get(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public HiJson get(String name) {
        try {
            if (target instanceof JSONObject) {
                target = ((JSONObject) target).get(name);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public HiJson get(int index) {
        try {
            if (target instanceof JSONArray) {
                target = ((JSONArray) target).get(index);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    /**
     * 获取JSONArray数组长度
     * @return
     */
    public int count() {
        try {
            if (target instanceof JSONArray) {
                return ((JSONArray) target).length();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
