package doext.define;

import core.object.DoUIModule;
import core.object.DoProperty;
import core.object.DoProperty.PropertyDataType;


public abstract class do_IconFont_MAbstract extends DoUIModule{

	protected do_IconFont_MAbstract() throws Exception {
		super();
	}
	
	/**
	 * 初始化
	 */
	@Override
	public void onInit() throws Exception{
        super.onInit();
        //注册属性
		this.registProperty(new DoProperty("iconCode", PropertyDataType.String, "", false));
		this.registProperty(new DoProperty("iconColor", PropertyDataType.String, "000000FF", false));
		this.registProperty(new DoProperty("iconName", PropertyDataType.String, "", false));
		this.registProperty(new DoProperty("iconSize", PropertyDataType.Number, "17", false));
	}
}