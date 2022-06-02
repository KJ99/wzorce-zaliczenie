package ug.wzorce;

import ug.wzorce.bridge.BridgePresenter;
import ug.wzorce.decorator.DecoratorPresenter;
import ug.wzorce.facade.FasadaPresenter;
import ug.wzorce.flyweight.FlyweightPresenter;
import ug.wzorce.proxy.ProxyPresenter;
import ug.wzorce.abstractfactory.AbstractFactoryPresenter;
import ug.wzorce.builder.BuilderPresenter;
import ug.wzorce.iterator.IteratorPresenter;
import ug.wzorce.singleton.SingletonPresenter;
import ug.wzorce.templatemethod.TemplateMethodPresenter;

public class Application {
    public void run() {
        SingletonPresenter singletonPresenter = new SingletonPresenter();
        singletonPresenter.present();
        BuilderPresenter builderPresenter = new BuilderPresenter();
        builderPresenter.present();
        AbstractFactoryPresenter factoryPresenter = new AbstractFactoryPresenter();
        factoryPresenter.present();
        FasadaPresenter presenter = new FasadaPresenter();
        presenter.present();
        BridgePresenter bridgePresenter = new BridgePresenter();
        bridgePresenter.present();
        ProxyPresenter proxyPresenter = new ProxyPresenter();
        proxyPresenter.present();
        IteratorPresenter iteratorPresenter = new IteratorPresenter();
        iteratorPresenter.present();
        DecoratorPresenter decoratorPresenter = new DecoratorPresenter();
        decoratorPresenter.present();
        TemplateMethodPresenter templateMethodPresenter = new TemplateMethodPresenter();
        templateMethodPresenter.present();
        FlyweightPresenter flyweightPresenter = new FlyweightPresenter();
        flyweightPresenter.present();
    }
}
