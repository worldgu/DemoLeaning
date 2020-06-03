5.2、创建工程
模板情况下 JavaFx 的创建非常简单，如下图
5.3、工程结构
```
itstack-test-01
└── src
    └── main
        └── java
            └── sample
                ├── Controller.java    
                ├── Main.java    
                └── sample.fxml
```

5.4、代码简述

Controller.java & 控制操作，默认生成代码为空

Main.java & 主窗体页面

sample.fxml & 配置

5.5、效果演示
点击运行 Main
好！不出意外你已经看到了一个空白的窗体，就像一个空白的娃娃。

6、Javafx Maven Demo
可以看到上面的工程已经很简单，但在实际使用中如果将业务代码与页面逻辑都放在一起写，对于小工程来说还好，但是如果是随着项目不断迭代不断拓展的话，那么将越来越难以维护。为此我们需要将工程 UI 独立出来，用 Maven 的方式进行管理。以下是我们的一个 Maven 管理的 Demo，为后续我们开发整体的页面打下基础。