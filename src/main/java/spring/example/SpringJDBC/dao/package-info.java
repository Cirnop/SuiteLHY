/**
 * DAO层：DAO层主要是做数据持久层的工作。负责与数据库进行交互的任务都封装在此 package。
 *
 * DAO层的设计：首先是设计 DAO 的接口，然后在 Spring 的配置文件中定义此接口的实现类（自动化注解实现），
 * -> 最后就可以在模块中调用 DAO 接口来进行数据模型基础业务的处理（面向接口，结构和功能设计清晰）。
 *
 * DAO层的数据源配置，以及有关数据库连接的参数都在 Spring 的配置文件中进行配置。
 */
package spring.example.SpringJDBC.dao;