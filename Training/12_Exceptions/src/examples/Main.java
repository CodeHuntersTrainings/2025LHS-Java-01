package examples;

public class Main {
    public static void main(String[] args) {
        DisneyExceptions.simulateNullPointer();
        //DisneyExceptions.simulateArrayIndex();
        //DisneyExceptions.simulateArithmetic();
        //DisneyExceptions.simulateNumberFormat();
        //DisneyExceptions.simulateCustomWrapped();
        //DisneyExceptions.simulateIOExceptionWrapped();

        //Other example I:
        /**
         * com.framework.FrameworkException: Error in web request
         *     at com.framework.ApplicationStarter.lambda$start$0(ApplicationStarter.java:15)
         *     at spark.RouteImpl$1.handle(RouteImpl.java:72)
         *     at spark.http.matching.Routes.execute(Routes.java:61)
         *     at spark.http.matching.MatcherFilter.doFilter(MatcherFilter.java:134)
         *     at spark.embeddedserver.jetty.JettyHandler.doHandle(JettyHandler.java:50)
         *     at org.eclipse.jetty.server.session.SessionHandler.doScope(SessionHandler.java:1568)
         *     at org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:144)
         *     at org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:132)
         *     at org.eclipse.jetty.server.Server.handle(Server.java:503)
         *     at org.eclipse.jetty.server.HttpChannel.handle(HttpChannel.java:364)
         *     at org.eclipse.jetty.server.HttpConnection.onFillable(HttpConnection.java:260)
         *     at org.eclipse.jetty.io.AbstractConnection$ReadCallback.succeeded(AbstractConnection.java:305)
         *     at org.eclipse.jetty.io.FillInterest.fillable(FillInterest.java:103)
         *     at org.eclipse.jetty.io.ChannelEndPoint$2.run(ChannelEndPoint.java:118)
         *     at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:765)
         *     at org.eclipse.jetty.util.thread.QueuedThreadPool$2.run(QueuedThreadPool.java:683)
         *     at java.base/java.lang.Thread.run(Thread.java:834)
         * Caused by: com.project.module.MyProjectFooBarException: The number of FooBars cannot be zero
         *     at com.project.module.MyProject.anotherMethod(MyProject.java:20)
         *     at com.project.module.MyProject.someMethod(MyProject.java:12)
         *     at com.framework.ApplicationStarter.lambda$start$0(ApplicationStarter.java:13)
         *     ... 16 more
         * Caused by: java.lang.ArithmeticException: The denominator must not be zero
         *     at org.apache.commons.lang3.math.Fraction.getFraction(Fraction.java:143)
         *     at com.project.module.MyProject.anotherMethod(MyProject.java:18)
         *     ... 18 more
         */

        //Other Example II:
        /**
         * Exception in thread "main" java.lang.RuntimeException: Something went terribly wrong in the Disney kingdom!
         *     at MagicalKingdom.main(MagicalKingdom.java:10)
         * Caused by: java.lang.RuntimeException: The sorcerer’s apprentice failed to conjure magic
         *     at Sorcery.performMagic(Sorcery.java:42)
         *     at MagicalKingdom.prepareMagic(MagicalKingdom.java:25)
         * Caused by: java.lang.IllegalStateException: The spell book was not found
         *     at SpellLibrary.getSpell(SpellLibrary.java:18)
         *     at Sorcery.loadSpell(Sorcery.java:30)
         * Caused by: java.lang.NoClassDefFoundError: disney/magic/SpellBook
         *     at SpellLibrary.<clinit>(SpellLibrary.java:10)
         * Caused by: java.lang.ClassNotFoundException: disney.magic.SpellBook
         *     at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
         *     at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
         *     at java.base/java.lang.Class.forName0(Native Method)
         *     at java.base/java.lang.Class.forName(Class.java:398)
         *     at SpellLibrary.initialize(SpellLibrary.java:50)
         */

        //Other Example III:
        /**
         * org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'employeeRepository': Cannot resolve reference to bean 'mongoTemplate' while setting bean property 'mongoOperations'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'mongoTemplate' defined in class path resource [MongoConfig.class]: Bean instantiation via constructor failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.data.mongodb.core.MongoTemplate]: Constructor threw exception; nested exception is java.lang.NoSuchMethodError: org.springframework.data.util.ClassTypeInformation.from(Ljava/lang/Class;)Lorg/springframework/data/util/ClassTypeInformation;
         *     at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:378)
         *     at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:110)
         *     at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1648)
         *     at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1400)
         *     at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:575)
         *     at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:498)
         *     ...
         * Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'mongoTemplate' defined in class path resource [MongoConfig.class]: Bean instantiation via constructor failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.data.mongodb.core.MongoTemplate]: Constructor threw exception; nested exception is java.lang.NoSuchMethodError: org.springframework.data.util.ClassTypeInformation.from(Ljava/lang/Class;)Lorg/springframework/data/util/ClassTypeInformation;
         *     at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:304)
         *     at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:285)
         *     at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireConstructor(AbstractAutowireCapableBeanFactory.java:1308)
         *     at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1154)
         *     at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:538)
         *     ...
         * Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.data.mongodb.core.MongoTemplate]: Factory method threw exception; nested exception is java.lang.NoSuchMethodError: org.springframework.data.util.ClassTypeInformation.from(Ljava/lang/Class;)Lorg/springframework/data/util/ClassTypeInformation;
         *     at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:184)
         *     at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:117)
         *     at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:300)
         *     ...
         * Caused by: java.lang.NoSuchMethodError: org.springframework.data.util.ClassTypeInformation.from(Ljava/lang/Class;)Lorg/springframework/data/util/ClassTypeInformation;
         *     at org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper.<clinit>(DefaultMongoTypeMapper.java:49)
         *     at org.springframework.data.mongodb.core.convert.MappingMongoConverter.<init>(MappingMongoConverter.java:111)
         *     at org.springframework.data.mongodb.core.MongoTemplate.getDefaultMongoConverter(MongoTemplate.java:2039)
         *     at org.springframework.data.mongodb.core.MongoTemplate.<init>(MongoTemplate.java:217)
         *     at com.example.MongoConfig.mongoTemplate(MongoConfig.java:25)
         */


    }
}