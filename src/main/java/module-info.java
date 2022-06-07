module com.kcstar {
    requires java.logging;
    requires azure.functions.java.library;
    requires azure.functions.java.core.library;
    provides com.kcstar.IHello with com.kcstar.HelloImpl;
    uses com.kcstar.IHello;
}