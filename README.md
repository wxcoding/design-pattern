# 设计模式
## OOP七大原则
* 开闭原则：对扩展开放，对修改关闭。
* 里氏替换原则：继承必须确保超类所拥有的性质在子类中仍然成立依赖倒置原则:要面向接口编程，不要面向实现编程。
* 单一职责原则：控制类的粒度大小、将对象解耦、提高其内聚性。
* 接口隔离原则：要为各个类建立它们需要的专用接口。
* 迪米特法则：只与你的直接朋友交谈，不跟“陌生人”说话。
* 合成复用原则：尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现。
## 创建型模式（creational）- 5:
* 单例模式（singleton）：核心思想是保证一个类在整个应用生命周期内仅有一个实例，并提供全局唯一的访问入口。通过私有化构造器、控制实例创建逻辑（如懒汉式、饿汉式），避免重复创建对象，节省内存资源，适用于全局共享的资源（如配置中心、连接池）。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 工厂模式（factory）：广义工厂模式的核心思想是将对象的创建逻辑从客户端代码中抽离，交由专门的工厂类负责，客户端无需关注对象的具体创建细节（如初始化参数、依赖注入），仅通过工厂获取对象，降低对象创建与使用的耦合度。
  * 简单工厂模式（simple）：核心思想是通过一个统一的工厂类，根据客户端传入的标识参数，动态决定创建哪一种产品类的实例。将对象创建集中管理，简化客户端调用，但新增产品需修改工厂类，违背 “开闭原则”，是工厂模式的简化版。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
  * 方法工厂模式（method）：核心思想是定义一个创建对象的抽象工厂接口 / 类，将具体产品的创建逻辑延迟到子类实现。每个子类工厂对应一种产品的创建，新增产品只需新增子类工厂，符合 “开闭原则”，解决简单工厂模式的扩展性问题。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 抽象工厂模式（abstract）：核心思想是提供一个创建一系列相关 / 依赖对象的抽象接口，无需指定具体类。围绕 “产品族” 设计（如 “华为工厂” 生产华为手机、华为平板，“苹果工厂” 生产苹果手机、苹果平板），保证同一产品族的对象兼容，提升产品族创建的一致性。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 建造者模式（builder）：核心思想是将复杂对象的构建过程与表示分离，把对象的属性赋值、组装等复杂步骤拆分为多个简单步骤，由建造者类分步构建，指挥者类控制构建顺序。客户端只需指定建造者即可获取定制化的复杂对象（如构建订单、文档），避免多参数构造器的混乱。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 原型模式（prototype）：核心思想是通过克隆已有实例（原型） 创建新对象，而非通过new关键字初始化。将对象创建方式从 “构造初始化” 改为 “拷贝复用”，避免重复执行复杂的初始化逻辑，提升创建效率，适用于创建成本高的大对象（如缓存对象、复杂配置对象）。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
## 结构型模式（structural）- 7:
* 适配器模式（adapter）：核心思想是将一个类的接口转换为客户端期望的另一种接口，解决因接口不兼容导致的类无法协同工作的问题，像 “电源适配器” 一样适配不同接口，保证功能复用。 
  * 类适配器：适配器模式的一种实现，核心思想是通过继承目标类 + 实现客户端期望接口，完成接口适配。因继承单一目标类，适配范围受限（Java 单继承），耦合度较高。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
  * 对象适配器：适配器模式的主流实现，核心思想是通过组合（持有目标对象引用）+ 实现客户端期望接口，完成接口适配。避免继承限制，适配灵活，耦合度更低，符合 “合成复用原则”。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
  * 接口适配器：核心思想是针对拥有多个方法的接口，提供一个空实现的抽象适配器类，客户端只需继承该抽象类，重写需要的方法，无需实现接口的所有方法，简化适配操作（如 Java 的MouseAdapter适配鼠标事件接口）。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 桥接模式（bridge）：核心思想是将抽象层与实现层分离，拆分为两个独立的继承体系，通过组合而非继承连接两者。避免多层继承导致的类爆炸（如 “形状 + 颜色” 场景：抽象形状类持有颜色实现类引用，形状和颜色可独立扩展），提升扩展性。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 装饰模式（decorator）：核心思想是动态地给对象添加额外职责，通过包装（装饰）目标对象，在不修改原对象代码的前提下逐层增强功能。符合 “开闭原则”，如 Java IO 的BufferedReader装饰FileReader添加缓冲功能，DataInputStream装饰FileInputStream添加数据读取功能。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 组合模式（composite）：核心思想是将对象组合成树形结构，表示 “部分 - 整体” 的层次关系，使客户端对单个对象（叶子节点）和组合对象（容器节点）的操作保持一致。无需区分 “单个元素” 和 “元素集合”，如文件系统中，文件（叶子）和文件夹（容器）均可执行 “删除”“计算大小” 操作。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 外观模式（facade）：核心思想是为复杂子系统提供一个统一的高层接口，封装子系统的复杂逻辑，简化客户端与子系统的交互。客户端只需调用外观接口，无需关注子系统内部的调用顺序和细节，如电商下单外观类封装 “库存扣减、订单创建、支付、物流生成”。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 享元模式（flyweight）：核心思想是复用内存中已存在的相同 / 相似对象，减少大量重复对象的创建。将对象属性分为 “内部状态”（可共享，如字体样式）和 “外部状态”（不可共享，如字体大小），通过池化技术缓存内部状态相同的对象，降低内存消耗（如 String 常量池、数据库连接池）。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 代理模式（proxy）：核心思想是为目标对象提供代理对象，由代理控制对目标对象的访问，并在调用前后添加额外逻辑（如日志、权限校验），保证客户端调用的透明性。代理作为 “中间层” 解耦客户端与目标对象。
  * 静态代理：代理模式的基础实现，核心思想是手动编写代理类，实现与目标对象相同的接口，持有目标对象引用，在编译期确定代理关系。逻辑简单但复用性差，新增代理需编写新类。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
  * 动态代理：核心思想是在运行时动态生成代理类，无需手动编写代理代码，提升复用性。根据实现方式分为 JDK 动态代理和 CGLIB 动态代理。 
    * Jdk：基于接口的动态代理，核心思想是通过java.lang.reflect.Proxy类和InvocationHandler接口，为实现了接口的目标对象生成代理对象。代理类与目标类实现相同接口，只能代理有接口的类。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
    * Cglib：基于继承的动态代理，核心思想是通过 ASM 字节码框架动态生成目标类的子类作为代理类，无需目标类实现接口。可代理任意类，但无法代理 final 类 / 方法。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
## 行为型模式（behavioral）- 11:
* 模板方法模式（template method）：核心思想是在抽象类中定义算法的骨架（固定步骤），将算法中可变的步骤延迟到子类实现。保证算法整体流程不变，细节可灵活定制，如 Spring 的JdbcTemplate固定数据库操作流程，开放 SQL 执行、结果映射等可变步骤。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 命令模式（command）：核心思想是将请求封装为独立的命令对象，使请求的发送者（调用者）与接收者（执行者）解耦。命令对象封装 “做什么” 和 “谁去做”，支持请求的排队、撤销、记录等操作，如遥控器按键对应命令对象，控制不同家电的操作。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 迭代器模式（iterator）：核心思想是提供一种统一的方式顺序访问聚合对象的元素，而不暴露聚合对象的内部结构。将遍历逻辑从聚合对象中抽离，客户端通过迭代器接口遍历 List、Set 等不同结构的集合，无需关注底层实现。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 观察者模式（oberserver）：核心思想是定义一对多的依赖关系，当主题（被观察对象）状态变化时，所有依赖它的观察者自动收到通知并更新。实现对象间的松耦合，主题无需知道观察者的具体逻辑，如 GUI 事件监听、Spring 事件机制。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 中介者模式（mediator）：核心思想是用一个中介对象封装多个对象之间的交互，使对象无需直接引用彼此，降低耦合度。将多对象的网状依赖转为中介者与对象的星型依赖，如聊天室中介转发用户消息，用户无需直接通信。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 备忘录模式（memento）：核心思想是在不破坏封装的前提下，捕获并保存对象的内部状态，以便后续恢复该状态。分离 “状态操作” 和 “状态保存”，实现状态的备份与回滚，如编辑器撤销、游戏存档。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 解释器模式（interpreter）：核心思想是定义语言的文法规则，并构建解释器来解释该语言的句子。适用于简单的自定义语言 / 规则解析（如表达式计算、配置文件解析），但文法复杂时会导致类爆炸。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 状态模式（state）9：核心思想是将对象的不同状态封装为独立的状态类，对象的行为随状态变化而改变，状态切换由状态类管理。替代大量的if-else状态判断，使状态逻辑更清晰，如订单的 “待支付、已支付、已取消” 状态封装为不同类。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 策略模式（stratgy）：核心思想是定义一系列算法，将每个算法封装为独立的策略类，使算法可互相替换，且算法变化不影响使用算法的客户端。解耦算法定义与使用，如排序算法（冒泡、快排）封装为不同策略，客户端可灵活切换。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 职责链模式（Chain of Responsibility）11：核心思想是将请求的处理者连成一条链，请求沿链传递，直到有处理者处理该请求。每个处理者只需关注自己负责的请求范围，无需知道链的整体结构，如权限校验链、日志处理链、SpringMVC 的拦截器链。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
* 访问者模式（visitor）：核心思想是在不修改元素类的前提下，为集合中的不同元素定义新的操作。将操作逻辑封装为访问者类，元素接受访问者的访问并调用其对应方法，适用于元素结构稳定但操作易变的场景（如报表生成、数据导出）。[coding](https://github.com/wxcoding/design-pattern/tree/master/src/main/java/com/guanwx/creational/builder)
