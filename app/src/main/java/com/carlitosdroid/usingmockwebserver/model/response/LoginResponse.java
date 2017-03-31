package com.carlitosdroid.usingmockwebserver.model.response;

import java.util.List;

/**
 * Created by Carlos Leonardo Camilo Vargas Huamán on 31/03/17.
 */

public class LoginResponse {


    /**
     * success : {"total":1}
     * contents : {"quotes":[{"quote":"I came from a real tough neighborhood. Once a guy pulled a knife on me. I knew he wasn't a professional, the knife had butter on it.","length":"132","author":"Rodney Dangerfield","tags":["funny","humor"],"category":"funny","id":"3e_ZsKxPKu5SuuAa6Pa_0AeF"}]}
     */

    private SuccessBean success;
    private ContentsBean contents;

    public SuccessBean getSuccess() {
        return success;
    }

    public void setSuccess(SuccessBean success) {
        this.success = success;
    }

    public ContentsBean getContents() {
        return contents;
    }

    public void setContents(ContentsBean contents) {
        this.contents = contents;
    }

    public static class SuccessBean {
        /**
         * total : 1
         */

        private int total;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }

    public static class ContentsBean {
        private List<QuotesBean> quotes;

        public List<QuotesBean> getQuotes() {
            return quotes;
        }

        public void setQuotes(List<QuotesBean> quotes) {
            this.quotes = quotes;
        }

        public static class QuotesBean {
            /**
             * quote : I came from a real tough neighborhood. Once a guy pulled a knife on me. I knew he wasn't a professional, the knife had butter on it.
             * length : 132
             * author : Rodney Dangerfield
             * tags : ["funny","humor"]
             * category : funny
             * id : 3e_ZsKxPKu5SuuAa6Pa_0AeF
             */

            private String quote;
            private String length;
            private String author;
            private String category;
            private String id;
            private List<String> tags;

            public String getQuote() {
                return quote;
            }

            public void setQuote(String quote) {
                this.quote = quote;
            }

            public String getLength() {
                return length;
            }

            public void setLength(String length) {
                this.length = length;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public List<String> getTags() {
                return tags;
            }

            public void setTags(List<String> tags) {
                this.tags = tags;
            }
        }
    }
}
