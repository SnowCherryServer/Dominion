package cn.lunadeer.dominion.managers;


import cn.lunadeer.minecraftpluginutils.i18n.Localization;
import cn.lunadeer.minecraftpluginutils.i18n.i18n;
import cn.lunadeer.minecraftpluginutils.i18n.i18nField;
import org.bukkit.plugin.java.JavaPlugin;

public class Translation extends Localization {
    @i18nField(defaultValue = "用法: /dominion set <权限名称> <true/false> [领地名称]")
    public static i18n Commands_SetDominionFlagUsage;

    @i18nField(defaultValue = "用法: /dominion create <领地名称>")
    public static i18n Commands_CreateDominionUsage;
    @i18nField(defaultValue = "请先使用工具选择领地的对角线两点，或使用 /dominion auto_create <领地名称> 创建自动领地")
    public static i18n Commands_CreateSelectPointsFirst;
    @i18nField(defaultValue = "用法: /dominion create_sub <子领地名称> [父领地名称]")
    public static i18n Commands_CreateSubDominionUsage;
    @i18nField(defaultValue = "请先使用工具选择子领地的对角线两点，或使用 /dominion auto_create_sub <子领地名称> [父领地名称] 创建自动子领地")
    public static i18n Commands_CreateSubSelectPointsFirst;
    @i18nField(defaultValue = "用法: /dominion auto_create <领地名称>")
    public static i18n Commands_AutoCreateDominionUsage;
    @i18nField(defaultValue = "用法: /dominion auto_create_sub <子领地名称> [父领地名称]")
    public static i18n Commands_AutoCreateSubDominionUsage;
    @i18nField(defaultValue = "自动创建领地功能已关闭")
    public static i18n Commands_AutoCreateDominionDisabled;
    @i18nField(defaultValue = "用法: /dominion expand [大小] [领地名称]")
    public static i18n Commands_ExpandDominionUsage;
    @i18nField(defaultValue = "用法: /dominion contract [大小] [领地名称]")
    public static i18n Commands_ContractDominionUsage;
    @i18nField(defaultValue = "大小应当为整数")
    public static i18n Commands_SizeShouldBeInteger;
    @i18nField(defaultValue = "大小应当大于0")
    public static i18n Commands_SizeShouldBePositive;
    @i18nField(defaultValue = "用法: /dominion delete <领地名称>")
    public static i18n Commands_DeleteDominionUsage;
    @i18nField(defaultValue = "用法: /dominion set_enter_msg <提示语> [领地名称]")
    public static i18n Commands_SetEnterMessageUsage;
    @i18nField(defaultValue = "用法: /dominion set_leave_msg <提示语> [领地名称]")
    public static i18n Commands_SetLeaveMessageUsage;
    @i18nField(defaultValue = "用法: /dominion set_tp_location [领地名称]")
    public static i18n Commands_SetTpLocationUsage;
    @i18nField(defaultValue = "用法: /dominion rename <原领地名称> <新领地名称>")
    public static i18n Commands_RenameDominionUsage;
    @i18nField(defaultValue = "用法: /dominion give <领地名称> <玩家名称>")
    public static i18n Commands_GiveDominionUsage;
    @i18nField(defaultValue = "用法: /dominion tp <领地名称>")
    public static i18n Commands_TpDominionUsage;
    @i18nField(defaultValue = "领地不存在")
    public static i18n Commands_DominionNotExist;
    @i18nField(defaultValue = "你是OP，将忽略领地传送限制")
    public static i18n Commands_OpBypassTpLimit;
    @i18nField(defaultValue = "领地所在世界不存在")
    public static i18n Commands_WorldNotExist;
    @i18nField(defaultValue = "领地 %s 没有设置传送点，将尝试传送到中心点")
    public static i18n Commands_DominionNoTpLocation;
    @i18nField(defaultValue = "领地 %s 传送点不在领地内，将尝试传送到中心点")
    public static i18n Commands_DominionTpLocationNotInDominion;
    @i18nField(defaultValue = "已将你传送到 %s")
    public static i18n Commands_TpToDominion;
    @i18nField(defaultValue = "管理员没有开启领地传送功能")
    public static i18n Commands_TpDisabled;
    @i18nField(defaultValue = "此领地禁止传送")
    public static i18n Commands_DominionNoTp;
    @i18nField(defaultValue = "你所在的权限组组不被允许传送到这个领地")
    public static i18n Commands_GroupNoTp;
    @i18nField(defaultValue = "你不被允许传送到这个领地")
    public static i18n Commands_PrivilegeNoTp;
    @i18nField(defaultValue = "请等待 %d 秒后再传送")
    public static i18n Commands_TpCoolDown;
    @i18nField(defaultValue = "传送将在 %d 秒后执行")
    public static i18n Commands_TpDelay;
    @i18nField(defaultValue = "传送倒计时 %d 秒")
    public static i18n Commands_TpCountDown;
    @i18nField(defaultValue = "传送失败，请重试")
    public static i18n Commands_TpFailed;
    @i18nField(defaultValue = "用法: /dominion set_map_color <颜色> [领地名称]")
    public static i18n Commands_SetMapColorUsage;

    @i18nField(defaultValue = "用法: /dominion group create <领地名称> <权限组名称>")
    public static i18n Commands_CreateGroupUsage;
    @i18nField(defaultValue = "用法: /dominion group delete <领地名称> <权限组名称>")
    public static i18n Commands_DeleteGroupUsage;
    @i18nField(defaultValue = "用法: /dominion group rename <领地名称> <权限组旧名称> <新名称>")
    public static i18n Commands_RenameGroupUsage;
    @i18nField(defaultValue = "用法: /dominion group set_flag <领地名称> <权限组名称> <权限名称> <true|false>")
    public static i18n Commands_SetGroupFlagUsage;
    @i18nField(defaultValue = "用法: /dominion group add_member <领地名称> <权限组名称> <玩家名称>")
    public static i18n Commands_AddGroupMemberUsage;
    @i18nField(defaultValue = "用法: /dominion group remove_member <领地名称> <权限组名称> <玩家名称>")
    public static i18n Commands_RemoveGroupMemberUsage;
    @i18nField(defaultValue = "用法: /dominion group <create|delete|rename|set_flag|add_member|remove_member|select_member|setting|list>")
    public static i18n Commands_GroupUsage;
    @i18nField(defaultValue = "新权限组名称")
    public static i18n Commands_NewGroupName;

    @i18nField(defaultValue = "用法: /dominion member add <领地名称> <玩家名称>")
    public static i18n Commands_DominionAddMemberUsage;
    @i18nField(defaultValue = "用法: /dominion member set_flag <领地名称> <玩家名称> <权限名称> <true/false>")
    public static i18n Commands_DominionSetFlagUsage;
    @i18nField(defaultValue = "用法: /dominion member remove <领地名称> <玩家名称>")
    public static i18n Commands_DominionRemoveMemberUsage;
    @i18nField(defaultValue = "用法: /dominion member apply_template <领地名称> <玩家名称> <模板名称>")
    public static i18n Commands_DominionApplyTemplateUsage;
    @i18nField(defaultValue = "用法: /dominion member <add/set_flag/remove/apply_template/list/setting/select_player/select_template>")
    public static i18n Commands_MemberUsage;

    @i18nField(defaultValue = "页码(可选)")
    public static i18n Commands_PageOptional;
    @i18nField(defaultValue = "参数不足")
    public static i18n Commands_ArgumentsNotEnough;
    @i18nField(defaultValue = "未知参数")
    public static i18n Commands_UnknownArgument;

    @i18nField(defaultValue = "Residence 迁移功能没有开启")
    public static i18n Commands_ResidenceMigrationDisabled;
    @i18nField(defaultValue = "用法: /dominion migrate <res领地名称>")
    public static i18n Commands_MigrateUsage;
    @i18nField(defaultValue = "你没有可迁移的数据")
    public static i18n Commands_NoMigrationData;
    @i18nField(defaultValue = "未找到指定的 Residence 领地")
    public static i18n Commands_NoResidenceDominion;
    @i18nField(defaultValue = "你不是该领地的所有者，无法迁移此领地")
    public static i18n Commands_ResidenceNotOwner;
    @i18nField(defaultValue = "迁移失败: %s")
    public static i18n Commands_MigrateFailed;
    @i18nField(defaultValue = "领地 %s 已从 Residence 迁移至 Dominion")
    public static i18n Commands_MigrateSuccess;

    @i18nField(defaultValue = "正在从数据库重新加载领地缓存...")
    public static i18n Commands_ReloadingDominionCache;
    @i18nField(defaultValue = "领地缓存已重新加载")
    public static i18n Commands_ReloadedDominionCache;
    @i18nField(defaultValue = "正在从数据库重新加载玩家权限缓存...")
    public static i18n Commands_ReloadingPrivilegeCache;
    @i18nField(defaultValue = "玩家权限缓存已重新加载")
    public static i18n Commands_ReloadedPrivilegeCache;
    @i18nField(defaultValue = "正在从数据库重新加载权限组缓存...")
    public static i18n Commands_ReloadingGroupCache;
    @i18nField(defaultValue = "权限组缓存已重新加载")
    public static i18n Commands_ReloadedGroupCache;
    @i18nField(defaultValue = "正在导出拥有领地的MCA文件列表...")
    public static i18n Commands_ExportingMCAList;
    @i18nField(defaultValue = "创建导出文件夹失败")
    public static i18n Commands_CreateExportFolderFailed;
    @i18nField(defaultValue = "正在导出 %s 的MCA文件列表...")
    public static i18n Commands_ExportingMCAListForWorld;
    @i18nField(defaultValue = "删除 %s 的MCA文件列表失败")
    public static i18n Commands_DeleteMCAListFailed;
    @i18nField(defaultValue = "创建 %s 的MCA文件列表失败")
    public static i18n Commands_CreateMCAListFailed;
    @i18nField(defaultValue = "写入 %s 失败")
    public static i18n Commands_WriteMCAListFailed;
    @i18nField(defaultValue = "导出 %s 的MCA文件列表失败")
    public static i18n Commands_ExportMCAListFailed;
    @i18nField(defaultValue = "MCA文件列表已导出到 %s")
    public static i18n Commands_ExportedMCAList;
    @i18nField(defaultValue = "正在重新加载配置文件...")
    public static i18n Commands_ReloadingConfig;
    @i18nField(defaultValue = "配置文件已重新加载")
    public static i18n Commands_ReloadedConfig;

    @i18nField(defaultValue = "最高Y坐标限制不能小于最低Y坐标限制")
    public static i18n Commands_MinYShouldBeLessThanMaxY;
    @i18nField(defaultValue = "最低Y坐标限制不能大于最高Y坐标限制")
    public static i18n Commands_MaxYShouldBeGreaterThanMinY;
    @i18nField(defaultValue = "X轴(东西)最大尺寸不能小于4")
    public static i18n Commands_SizeXShouldBeGreaterThan4;
    @i18nField(defaultValue = "Z轴(南北)最大尺寸不能小于4")
    public static i18n Commands_SizeZShouldBeGreaterThan4;
    @i18nField(defaultValue = "Y轴(垂直)最大尺寸不能小于4")
    public static i18n Commands_SizeYShouldBeGreaterThan4;
    @i18nField(defaultValue = "每个玩家领地数量限制不能小于0")
    public static i18n Commands_AmountShouldBeGreaterThan0;
    @i18nField(defaultValue = "领地深度限制不能小于0")
    public static i18n Commands_DepthShouldBeGreaterThan0;
    @i18nField(defaultValue = "传送延迟不能小于0")
    public static i18n Commands_TpDelayShouldBeGreaterThan0;
    @i18nField(defaultValue = "传送冷却时间不能小于0")
    public static i18n Commands_TpCoolDownShouldBeGreaterThan0;
    @i18nField(defaultValue = "每方块单价不能小于0")
    public static i18n Commands_PriceShouldBeGreaterThan0;
    @i18nField(defaultValue = "领地退款比例不能小于0")
    public static i18n Commands_RefundShouldBeGreaterThan0;
    @i18nField(defaultValue = "出生点保护半径不能小于或等于0")
    public static i18n Commands_SpawnProtectRadiusShouldBeGreaterThan0;

    @i18nField(defaultValue = "用法: /dominion template create <模板名称>")
    public static i18n Commands_CreateTemplateUsage;
    @i18nField(defaultValue = "用法: /dominion template delete <模板名称>")
    public static i18n Commands_DeleteTemplateUsage;
    @i18nField(defaultValue = "用法: /dominion template set_flag <模板名称> <权限名称> <true/false>")
    public static i18n Commands_SetTemplateFlagUsage;
    @i18nField(defaultValue = "用法: /dominion template <list|setting|delete|create|set_flag>")
    public static i18n Commands_TemplateUsage;
    @i18nField(defaultValue = "新模板名称")
    public static i18n Commands_NewTemplateName;

    @i18nField(defaultValue = "用法: /dominion use_title <权限组ID>")
    public static i18n Commands_UseTitleUsage;
    @i18nField(defaultValue = "成功卸下权限组称号")
    public static i18n Commands_RemoveTitleSuccess;
    @i18nField(defaultValue = "权限组不存在")
    public static i18n Commands_GroupNotExist;
    @i18nField(defaultValue = "权限组 %s 所属领地不存在")
    public static i18n Commands_GroupDominionNotExist;
    @i18nField(defaultValue = "你不是 %s 的成员，无法使用其称号")
    public static i18n Commands_NotGroupMember;
    @i18nField(defaultValue = "你不属于权限组 %s，无法使用其称号")
    public static i18n Commands_NotGroupMember2;
    @i18nField(defaultValue = "成功使用权限组 %s 称号")
    public static i18n Commands_UseTitleSuccess;
    @i18nField(defaultValue = "使用称号失败：%s")
    public static i18n Commands_UseTitleFailed;

    @i18nField(defaultValue = "AutoCreateRadius 不能等于 0，已重置为 10")
    public static i18n Config_AutoCreateRadiusError;
    @i18nField(defaultValue = "AutoCleanAfterDays 不能等于 0，已重置为 180")
    public static i18n Config_AutoCleanAfterDaysError;
    @i18nField(defaultValue = "工具名称设置错误，已重置为 ARROW")
    public static i18n Config_ToolNameError;
    @i18nField(defaultValue = "Limit.SizeX 尺寸不能小于 4，已重置为 128")
    public static i18n Config_LimitSizeXError;
    @i18nField(defaultValue = "Limit.SizeY 尺寸不能小于 4，已重置为 64")
    public static i18n Config_LimitSizeYError;
    @i18nField(defaultValue = "Limit.SizeZ 尺寸不能小于 4，已重置为 128")
    public static i18n Config_LimitSizeZError;
    @i18nField(defaultValue = "Limit.MinY 不能大于或等于 Limit.MaxY，已重置为 -64 320")
    public static i18n Config_LimitMinYError;
    @i18nField(defaultValue = "Economy.Refund 设置不合法，已重置为 0.85")
    public static i18n Config_RefundError;
    @i18nField(defaultValue = "Economy.Price 设置不合法，已重置为 10.0")
    public static i18n Config_PriceError;
    @i18nField(defaultValue = "启用 Limit.Vert 时 Limit.SizeY 不能小于 Limit.MaxY - Limit.MinY，已自动调整为 %d")
    public static i18n Config_LimitSizeYAutoAdjust;
    @i18nField(defaultValue = "Limit.Amount 设置不合法，已重置为 10")
    public static i18n Config_AmountError;
    @i18nField(defaultValue = "Limit.Depth 设置不合法，已重置为 3")
    public static i18n Config_DepthError;

    @i18nField(defaultValue = "语言设置，参考 languages 文件夹下的文件名")
    public static i18n ConfigComment_Language;
    @i18nField(defaultValue = "自动创建领地的半径，单位为方块")
    public static i18n ConfigComment_AutoCreateRadius;
    @i18nField(defaultValue = "-1表示不开启")
    public static i18n ConfigComment_NegativeOneDisabled;
    @i18nField(defaultValue = "默认玩家圈地限制")
    public static i18n ConfigComment_DefaultLimit;
    @i18nField(defaultValue = "出生点保护半径 出生点此范围内不允许圈地")
    public static i18n ConfigComment_SpawnProtectRadius;
    @i18nField(defaultValue = "最小Y坐标")
    public static i18n ConfigComment_MinY;
    @i18nField(defaultValue = "最大Y坐标")
    public static i18n ConfigComment_MaxY;
    @i18nField(defaultValue = "-1表示不限制")
    public static i18n ConfigComment_NegativeOneUnlimited;
    @i18nField(defaultValue = "X方向最大长度")
    public static i18n ConfigComment_SizeX;
    @i18nField(defaultValue = "Y方向最大长度")
    public static i18n ConfigComment_SizeY;
    @i18nField(defaultValue = "Z方向最大长度")
    public static i18n ConfigComment_SizeZ;
    @i18nField(defaultValue = "最大领地数量")
    public static i18n ConfigComment_Amount;
    @i18nField(defaultValue = "子领地深度")
    public static i18n ConfigComment_Depth;
    @i18nField(defaultValue = "0表示不开启")
    public static i18n ConfigComment_ZeroDisabled;
    @i18nField(defaultValue = "是否自动延伸到 MaxY 和 MinY")
    public static i18n ConfigComment_Vert;
    @i18nField(defaultValue = "不允许圈地的世界列表")
    public static i18n ConfigComment_DisabledWorlds;
    @i18nField(defaultValue = "是否允许OP无视领地限制")
    public static i18n ConfigComment_OpBypass;
    @i18nField(defaultValue = "传送延迟 秒")
    public static i18n ConfigComment_TpDelay;
    @i18nField(defaultValue = "传送冷却 秒")
    public static i18n ConfigComment_TpCoolDown;
    @i18nField(defaultValue = "自动清理长时间未上线玩家的领地（天）")
    public static i18n ConfigComment_AutoCleanAfterDays;
    @i18nField(defaultValue = "圈地工具名称")
    public static i18n ConfigComment_ToolName;
    @i18nField(defaultValue = "经济设置")
    public static i18n ConfigComment_Economy;
    @i18nField(defaultValue = "需要安装 Vault 前置及插件")
    public static i18n ConfigComment_VaultRequired;
    @i18nField(defaultValue = "圈地价格 单位每方块")
    public static i18n ConfigComment_Price;
    @i18nField(defaultValue = "是否只计算xz平面积")
    public static i18n ConfigComment_OnlyXZ;
    @i18nField(defaultValue = "删除或缩小领地时的退款比例")
    public static i18n ConfigComment_Refund;
    @i18nField(defaultValue = "飞行权限节点 - 拥有以下任意一个权限节点的玩家不会被本插件拦截飞行")
    public static i18n ConfigComment_FlyPermission;
    @i18nField(defaultValue = "是否允许玩家从 Residence 迁移领地数据")
    public static i18n ConfigComment_ResidenceMigration;
    @i18nField(defaultValue = "权限组称号 - 使用权限组当作称号(需要PlaceholderAPI插件)")
    public static i18n ConfigComment_GroupTitle;
    @i18nField(defaultValue = "变量: %dominion_group_title%")
    public static i18n ConfigComment_GroupTitleVariable;
    @i18nField(defaultValue = "前后缀如需要加颜色请使用这种格式 &#ffffff")
    public static i18n ConfigComment_GroupTitleColor;
    @i18nField(defaultValue = "性能测试计时器")
    public static i18n ConfigComment_PerformanceTimer;


    public Translation(JavaPlugin plugin) {
        super(plugin);
    }
}
