SUMMARY = "Kernel firmware files for Nvidia Tegra and graphics drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Nvidia Tegra and graphics drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-nvidia-20230517-1.1.noarch.rpm"
RPM_HASH = "399d1e9991cd02fc4b217e41de628ca822a58846e1bf42f20ca84ed8272085c8f4def490814faf5ea484d555c755b39fd6f25a05192e71677124146ac7a4feb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(nvidia/ga102/acr/ucode_ahesasc.bin) firmware(nvidia/ga102/acr/ucode_asb.bin) firmware(nvidia/ga102/acr/ucode_unload.bin) firmware(nvidia/ga102/gr/NET_img.bin) firmware(nvidia/ga102/gr/fecs_bl.bin) firmware(nvidia/ga102/gr/fecs_sig.bin) firmware(nvidia/ga102/gr/gpccs_bl.bin) firmware(nvidia/ga102/gr/gpccs_sig.bin) firmware(nvidia/ga102/nvdec/scrubber.bin) firmware(nvidia/ga102/sec2/desc.bin) firmware(nvidia/ga102/sec2/hs_bl_sig.bin) firmware(nvidia/ga102/sec2/image.bin) firmware(nvidia/ga102/sec2/sig.bin) firmware(nvidia/ga103/acr/ucode_ahesasc.bin) firmware(nvidia/ga103/acr/ucode_asb.bin) firmware(nvidia/ga103/acr/ucode_unload.bin) firmware(nvidia/ga103/gr/NET_img.bin) firmware(nvidia/ga103/gr/fecs_bl.bin) firmware(nvidia/ga103/gr/fecs_sig.bin) firmware(nvidia/ga103/gr/gpccs_bl.bin) firmware(nvidia/ga103/gr/gpccs_sig.bin) firmware(nvidia/ga103/nvdec/scrubber.bin) firmware(nvidia/ga103/sec2/desc.bin) firmware(nvidia/ga103/sec2/hs_bl_sig.bin) firmware(nvidia/ga103/sec2/image.bin) firmware(nvidia/ga103/sec2/sig.bin) firmware(nvidia/ga104/acr/ucode_ahesasc.bin) firmware(nvidia/ga104/acr/ucode_asb.bin) firmware(nvidia/ga104/acr/ucode_unload.bin) firmware(nvidia/ga104/gr/NET_img.bin) firmware(nvidia/ga104/gr/fecs_bl.bin) firmware(nvidia/ga104/gr/fecs_sig.bin) firmware(nvidia/ga104/gr/gpccs_bl.bin) firmware(nvidia/ga104/gr/gpccs_sig.bin) firmware(nvidia/ga104/nvdec/scrubber.bin) firmware(nvidia/ga104/sec2/desc.bin) firmware(nvidia/ga104/sec2/hs_bl_sig.bin) firmware(nvidia/ga104/sec2/image.bin) firmware(nvidia/ga104/sec2/sig.bin) firmware(nvidia/ga106/acr/ucode_ahesasc.bin) firmware(nvidia/ga106/acr/ucode_asb.bin) firmware(nvidia/ga106/acr/ucode_unload.bin) firmware(nvidia/ga106/gr/NET_img.bin) firmware(nvidia/ga106/gr/fecs_bl.bin) firmware(nvidia/ga106/gr/fecs_sig.bin) firmware(nvidia/ga106/gr/gpccs_bl.bin) firmware(nvidia/ga106/gr/gpccs_sig.bin) firmware(nvidia/ga106/nvdec/scrubber.bin) firmware(nvidia/ga106/sec2/desc.bin) firmware(nvidia/ga106/sec2/hs_bl_sig.bin) firmware(nvidia/ga106/sec2/image.bin) firmware(nvidia/ga106/sec2/sig.bin) firmware(nvidia/ga107/acr/ucode_ahesasc.bin) firmware(nvidia/ga107/acr/ucode_asb.bin) firmware(nvidia/ga107/acr/ucode_unload.bin) firmware(nvidia/ga107/gr/NET_img.bin) firmware(nvidia/ga107/gr/fecs_bl.bin) firmware(nvidia/ga107/gr/fecs_sig.bin) firmware(nvidia/ga107/gr/gpccs_bl.bin) firmware(nvidia/ga107/gr/gpccs_sig.bin) firmware(nvidia/ga107/nvdec/scrubber.bin) firmware(nvidia/ga107/sec2/desc.bin) firmware(nvidia/ga107/sec2/hs_bl_sig.bin) firmware(nvidia/ga107/sec2/image.bin) firmware(nvidia/ga107/sec2/sig.bin) firmware(nvidia/gk20a/fecs_data.bin) firmware(nvidia/gk20a/fecs_inst.bin) firmware(nvidia/gk20a/gpccs_data.bin) firmware(nvidia/gk20a/gpccs_inst.bin) firmware(nvidia/gk20a/sw_bundle_init.bin) firmware(nvidia/gk20a/sw_ctx.bin) firmware(nvidia/gk20a/sw_method_init.bin) firmware(nvidia/gk20a/sw_nonctx.bin) firmware(nvidia/gm200/acr/bl.bin) firmware(nvidia/gm200/acr/ucode_load.bin) firmware(nvidia/gm200/acr/ucode_unload.bin) firmware(nvidia/gm200/gr/fecs_bl.bin) firmware(nvidia/gm200/gr/fecs_data.bin) firmware(nvidia/gm200/gr/fecs_inst.bin) firmware(nvidia/gm200/gr/fecs_sig.bin) firmware(nvidia/gm200/gr/gpccs_bl.bin) firmware(nvidia/gm200/gr/gpccs_data.bin) firmware(nvidia/gm200/gr/gpccs_inst.bin) firmware(nvidia/gm200/gr/gpccs_sig.bin) firmware(nvidia/gm200/gr/sw_bundle_init.bin) firmware(nvidia/gm200/gr/sw_ctx.bin) firmware(nvidia/gm200/gr/sw_method_init.bin) firmware(nvidia/gm200/gr/sw_nonctx.bin) firmware(nvidia/gm204/acr/bl.bin) firmware(nvidia/gm204/acr/ucode_load.bin) firmware(nvidia/gm204/acr/ucode_unload.bin) firmware(nvidia/gm204/gr/fecs_bl.bin) firmware(nvidia/gm204/gr/fecs_data.bin) firmware(nvidia/gm204/gr/fecs_inst.bin) firmware(nvidia/gm204/gr/fecs_sig.bin) firmware(nvidia/gm204/gr/gpccs_bl.bin) firmware(nvidia/gm204/gr/gpccs_data.bin) firmware(nvidia/gm204/gr/gpccs_inst.bin) firmware(nvidia/gm204/gr/gpccs_sig.bin) firmware(nvidia/gm204/gr/sw_bundle_init.bin) firmware(nvidia/gm204/gr/sw_ctx.bin) firmware(nvidia/gm204/gr/sw_method_init.bin) firmware(nvidia/gm204/gr/sw_nonctx.bin) firmware(nvidia/gm206/acr/bl.bin) firmware(nvidia/gm206/acr/ucode_load.bin) firmware(nvidia/gm206/acr/ucode_unload.bin) firmware(nvidia/gm206/gr/fecs_bl.bin) firmware(nvidia/gm206/gr/fecs_data.bin) firmware(nvidia/gm206/gr/fecs_inst.bin) firmware(nvidia/gm206/gr/fecs_sig.bin) firmware(nvidia/gm206/gr/gpccs_bl.bin) firmware(nvidia/gm206/gr/gpccs_data.bin) firmware(nvidia/gm206/gr/gpccs_inst.bin) firmware(nvidia/gm206/gr/gpccs_sig.bin) firmware(nvidia/gm206/gr/sw_bundle_init.bin) firmware(nvidia/gm206/gr/sw_ctx.bin) firmware(nvidia/gm206/gr/sw_method_init.bin) firmware(nvidia/gm206/gr/sw_nonctx.bin) firmware(nvidia/gm20b/acr/bl.bin) firmware(nvidia/gm20b/acr/ucode_load.bin) firmware(nvidia/gm20b/gr/fecs_bl.bin) firmware(nvidia/gm20b/gr/fecs_data.bin) firmware(nvidia/gm20b/gr/fecs_inst.bin) firmware(nvidia/gm20b/gr/fecs_sig.bin) firmware(nvidia/gm20b/gr/gpccs_data.bin) firmware(nvidia/gm20b/gr/gpccs_inst.bin) firmware(nvidia/gm20b/gr/sw_bundle_init.bin) firmware(nvidia/gm20b/gr/sw_ctx.bin) firmware(nvidia/gm20b/gr/sw_method_init.bin) firmware(nvidia/gm20b/gr/sw_nonctx.bin) firmware(nvidia/gm20b/pmu/desc.bin) firmware(nvidia/gm20b/pmu/image.bin) firmware(nvidia/gm20b/pmu/sig.bin) firmware(nvidia/gp100/acr/bl.bin) firmware(nvidia/gp100/acr/ucode_load.bin) firmware(nvidia/gp100/acr/ucode_unload.bin) firmware(nvidia/gp100/gr/fecs_bl.bin) firmware(nvidia/gp100/gr/fecs_data.bin) firmware(nvidia/gp100/gr/fecs_inst.bin) firmware(nvidia/gp100/gr/fecs_sig.bin) firmware(nvidia/gp100/gr/gpccs_bl.bin) firmware(nvidia/gp100/gr/gpccs_data.bin) firmware(nvidia/gp100/gr/gpccs_inst.bin) firmware(nvidia/gp100/gr/gpccs_sig.bin) firmware(nvidia/gp100/gr/sw_bundle_init.bin) firmware(nvidia/gp100/gr/sw_ctx.bin) firmware(nvidia/gp100/gr/sw_method_init.bin) firmware(nvidia/gp100/gr/sw_nonctx.bin) firmware(nvidia/gp102/acr/bl.bin) firmware(nvidia/gp102/acr/ucode_load.bin) firmware(nvidia/gp102/acr/ucode_unload.bin) firmware(nvidia/gp102/acr/unload_bl.bin) firmware(nvidia/gp102/gr/fecs_bl.bin) firmware(nvidia/gp102/gr/fecs_data.bin) firmware(nvidia/gp102/gr/fecs_inst.bin) firmware(nvidia/gp102/gr/fecs_sig.bin) firmware(nvidia/gp102/gr/gpccs_bl.bin) firmware(nvidia/gp102/gr/gpccs_data.bin) firmware(nvidia/gp102/gr/gpccs_inst.bin) firmware(nvidia/gp102/gr/gpccs_sig.bin) firmware(nvidia/gp102/gr/sw_bundle_init.bin) firmware(nvidia/gp102/gr/sw_ctx.bin) firmware(nvidia/gp102/gr/sw_method_init.bin) firmware(nvidia/gp102/gr/sw_nonctx.bin) firmware(nvidia/gp102/nvdec/scrubber.bin) firmware(nvidia/gp102/sec2/desc-1.bin) firmware(nvidia/gp102/sec2/desc.bin) firmware(nvidia/gp102/sec2/image-1.bin) firmware(nvidia/gp102/sec2/image.bin) firmware(nvidia/gp102/sec2/sig-1.bin) firmware(nvidia/gp102/sec2/sig.bin) firmware(nvidia/gp104/acr/bl.bin) firmware(nvidia/gp104/acr/ucode_load.bin) firmware(nvidia/gp104/acr/ucode_unload.bin) firmware(nvidia/gp104/acr/unload_bl.bin) firmware(nvidia/gp104/gr/fecs_bl.bin) firmware(nvidia/gp104/gr/fecs_data.bin) firmware(nvidia/gp104/gr/fecs_inst.bin) firmware(nvidia/gp104/gr/fecs_sig.bin) firmware(nvidia/gp104/gr/gpccs_bl.bin) firmware(nvidia/gp104/gr/gpccs_data.bin) firmware(nvidia/gp104/gr/gpccs_inst.bin) firmware(nvidia/gp104/gr/gpccs_sig.bin) firmware(nvidia/gp104/gr/sw_bundle_init.bin) firmware(nvidia/gp104/gr/sw_ctx.bin) firmware(nvidia/gp104/gr/sw_method_init.bin) firmware(nvidia/gp104/gr/sw_nonctx.bin) firmware(nvidia/gp104/nvdec/scrubber.bin) firmware(nvidia/gp104/sec2/desc-1.bin) firmware(nvidia/gp104/sec2/desc.bin) firmware(nvidia/gp104/sec2/image-1.bin) firmware(nvidia/gp104/sec2/image.bin) firmware(nvidia/gp104/sec2/sig-1.bin) firmware(nvidia/gp104/sec2/sig.bin) firmware(nvidia/gp106/acr/bl.bin) firmware(nvidia/gp106/acr/ucode_load.bin) firmware(nvidia/gp106/acr/ucode_unload.bin) firmware(nvidia/gp106/acr/unload_bl.bin) firmware(nvidia/gp106/gr/fecs_bl.bin) firmware(nvidia/gp106/gr/fecs_data.bin) firmware(nvidia/gp106/gr/fecs_inst.bin) firmware(nvidia/gp106/gr/fecs_sig.bin) firmware(nvidia/gp106/gr/gpccs_bl.bin) firmware(nvidia/gp106/gr/gpccs_data.bin) firmware(nvidia/gp106/gr/gpccs_inst.bin) firmware(nvidia/gp106/gr/gpccs_sig.bin) firmware(nvidia/gp106/gr/sw_bundle_init.bin) firmware(nvidia/gp106/gr/sw_ctx.bin) firmware(nvidia/gp106/gr/sw_method_init.bin) firmware(nvidia/gp106/gr/sw_nonctx.bin) firmware(nvidia/gp106/nvdec/scrubber.bin) firmware(nvidia/gp106/sec2/desc-1.bin) firmware(nvidia/gp106/sec2/desc.bin) firmware(nvidia/gp106/sec2/image-1.bin) firmware(nvidia/gp106/sec2/image.bin) firmware(nvidia/gp106/sec2/sig-1.bin) firmware(nvidia/gp106/sec2/sig.bin) firmware(nvidia/gp107/acr/bl.bin) firmware(nvidia/gp107/acr/ucode_load.bin) firmware(nvidia/gp107/acr/ucode_unload.bin) firmware(nvidia/gp107/acr/unload_bl.bin) firmware(nvidia/gp107/gr/fecs_bl.bin) firmware(nvidia/gp107/gr/fecs_data.bin) firmware(nvidia/gp107/gr/fecs_inst.bin) firmware(nvidia/gp107/gr/fecs_sig.bin) firmware(nvidia/gp107/gr/gpccs_bl.bin) firmware(nvidia/gp107/gr/gpccs_data.bin) firmware(nvidia/gp107/gr/gpccs_inst.bin) firmware(nvidia/gp107/gr/gpccs_sig.bin) firmware(nvidia/gp107/gr/sw_bundle_init.bin) firmware(nvidia/gp107/gr/sw_ctx.bin) firmware(nvidia/gp107/gr/sw_method_init.bin) firmware(nvidia/gp107/gr/sw_nonctx.bin) firmware(nvidia/gp107/nvdec/scrubber.bin) firmware(nvidia/gp107/sec2/desc-1.bin) firmware(nvidia/gp107/sec2/desc.bin) firmware(nvidia/gp107/sec2/image-1.bin) firmware(nvidia/gp107/sec2/image.bin) firmware(nvidia/gp107/sec2/sig-1.bin) firmware(nvidia/gp107/sec2/sig.bin) firmware(nvidia/gp108/acr/bl.bin) firmware(nvidia/gp108/acr/ucode_load.bin) firmware(nvidia/gp108/acr/ucode_unload.bin) firmware(nvidia/gp108/acr/unload_bl.bin) firmware(nvidia/gp108/gr/fecs_bl.bin) firmware(nvidia/gp108/gr/fecs_data.bin) firmware(nvidia/gp108/gr/fecs_inst.bin) firmware(nvidia/gp108/gr/fecs_sig.bin) firmware(nvidia/gp108/gr/gpccs_bl.bin) firmware(nvidia/gp108/gr/gpccs_data.bin) firmware(nvidia/gp108/gr/gpccs_inst.bin) firmware(nvidia/gp108/gr/gpccs_sig.bin) firmware(nvidia/gp108/gr/sw_bundle_init.bin) firmware(nvidia/gp108/gr/sw_ctx.bin) firmware(nvidia/gp108/gr/sw_method_init.bin) firmware(nvidia/gp108/gr/sw_nonctx.bin) firmware(nvidia/gp108/nvdec/scrubber.bin) firmware(nvidia/gp108/sec2/desc.bin) firmware(nvidia/gp108/sec2/image.bin) firmware(nvidia/gp108/sec2/sig.bin) firmware(nvidia/gp10b/acr/bl.bin) firmware(nvidia/gp10b/acr/ucode_load.bin) firmware(nvidia/gp10b/gr/fecs_bl.bin) firmware(nvidia/gp10b/gr/fecs_data.bin) firmware(nvidia/gp10b/gr/fecs_inst.bin) firmware(nvidia/gp10b/gr/fecs_sig.bin) firmware(nvidia/gp10b/gr/gpccs_bl.bin) firmware(nvidia/gp10b/gr/gpccs_data.bin) firmware(nvidia/gp10b/gr/gpccs_inst.bin) firmware(nvidia/gp10b/gr/gpccs_sig.bin) firmware(nvidia/gp10b/gr/sw_bundle_init.bin) firmware(nvidia/gp10b/gr/sw_ctx.bin) firmware(nvidia/gp10b/gr/sw_method_init.bin) firmware(nvidia/gp10b/gr/sw_nonctx.bin) firmware(nvidia/gp10b/pmu/desc.bin) firmware(nvidia/gp10b/pmu/image.bin) firmware(nvidia/gp10b/pmu/sig.bin) firmware(nvidia/gv100/acr/bl.bin) firmware(nvidia/gv100/acr/ucode_load.bin) firmware(nvidia/gv100/acr/ucode_unload.bin) firmware(nvidia/gv100/acr/unload_bl.bin) firmware(nvidia/gv100/gr/fecs_bl.bin) firmware(nvidia/gv100/gr/fecs_data.bin) firmware(nvidia/gv100/gr/fecs_inst.bin) firmware(nvidia/gv100/gr/fecs_sig.bin) firmware(nvidia/gv100/gr/gpccs_bl.bin) firmware(nvidia/gv100/gr/gpccs_data.bin) firmware(nvidia/gv100/gr/gpccs_inst.bin) firmware(nvidia/gv100/gr/gpccs_sig.bin) firmware(nvidia/gv100/gr/sw_bundle_init.bin) firmware(nvidia/gv100/gr/sw_ctx.bin) firmware(nvidia/gv100/gr/sw_method_init.bin) firmware(nvidia/gv100/gr/sw_nonctx.bin) firmware(nvidia/gv100/nvdec/scrubber.bin) firmware(nvidia/gv100/sec2/desc.bin) firmware(nvidia/gv100/sec2/image.bin) firmware(nvidia/gv100/sec2/sig.bin) firmware(nvidia/tegra124/vic.bin) firmware(nvidia/tegra124/vic03_ucode.bin) firmware(nvidia/tegra124/xusb.bin) firmware(nvidia/tegra186/vic.bin) firmware(nvidia/tegra186/vic04_ucode.bin) firmware(nvidia/tegra186/xusb.bin) firmware(nvidia/tegra194/vic.bin) firmware(nvidia/tegra194/xusb.bin) firmware(nvidia/tegra210/vic.bin) firmware(nvidia/tegra210/vic04_ucode.bin) firmware(nvidia/tegra210/xusb.bin) firmware(nvidia/tu102/acr/bl.bin) firmware(nvidia/tu102/acr/ucode_ahesasc.bin) firmware(nvidia/tu102/acr/ucode_asb.bin) firmware(nvidia/tu102/acr/ucode_unload.bin) firmware(nvidia/tu102/acr/unload_bl.bin) firmware(nvidia/tu102/gr/fecs_bl.bin) firmware(nvidia/tu102/gr/fecs_data.bin) firmware(nvidia/tu102/gr/fecs_inst.bin) firmware(nvidia/tu102/gr/fecs_sig.bin) firmware(nvidia/tu102/gr/gpccs_bl.bin) firmware(nvidia/tu102/gr/gpccs_data.bin) firmware(nvidia/tu102/gr/gpccs_inst.bin) firmware(nvidia/tu102/gr/gpccs_sig.bin) firmware(nvidia/tu102/gr/sw_bundle_init.bin) firmware(nvidia/tu102/gr/sw_ctx.bin) firmware(nvidia/tu102/gr/sw_method_init.bin) firmware(nvidia/tu102/gr/sw_nonctx.bin) firmware(nvidia/tu102/gr/sw_veid_bundle_init.bin) firmware(nvidia/tu102/nvdec/scrubber.bin) firmware(nvidia/tu102/sec2/desc.bin) firmware(nvidia/tu102/sec2/image.bin) firmware(nvidia/tu102/sec2/sig.bin) firmware(nvidia/tu104/acr/bl.bin) firmware(nvidia/tu104/acr/ucode_ahesasc.bin) firmware(nvidia/tu104/acr/ucode_asb.bin) firmware(nvidia/tu104/acr/ucode_unload.bin) firmware(nvidia/tu104/acr/unload_bl.bin) firmware(nvidia/tu104/gr/fecs_bl.bin) firmware(nvidia/tu104/gr/fecs_data.bin) firmware(nvidia/tu104/gr/fecs_inst.bin) firmware(nvidia/tu104/gr/fecs_sig.bin) firmware(nvidia/tu104/gr/gpccs_bl.bin) firmware(nvidia/tu104/gr/gpccs_data.bin) firmware(nvidia/tu104/gr/gpccs_inst.bin) firmware(nvidia/tu104/gr/gpccs_sig.bin) firmware(nvidia/tu104/gr/sw_bundle_init.bin) firmware(nvidia/tu104/gr/sw_ctx.bin) firmware(nvidia/tu104/gr/sw_method_init.bin) firmware(nvidia/tu104/gr/sw_nonctx.bin) firmware(nvidia/tu104/gr/sw_veid_bundle_init.bin) firmware(nvidia/tu104/nvdec/scrubber.bin) firmware(nvidia/tu104/sec2/desc.bin) firmware(nvidia/tu104/sec2/image.bin) firmware(nvidia/tu104/sec2/sig.bin) firmware(nvidia/tu106/acr/bl.bin) firmware(nvidia/tu106/acr/ucode_ahesasc.bin) firmware(nvidia/tu106/acr/ucode_asb.bin) firmware(nvidia/tu106/acr/ucode_unload.bin) firmware(nvidia/tu106/acr/unload_bl.bin) firmware(nvidia/tu106/gr/fecs_bl.bin) firmware(nvidia/tu106/gr/fecs_data.bin) firmware(nvidia/tu106/gr/fecs_inst.bin) firmware(nvidia/tu106/gr/fecs_sig.bin) firmware(nvidia/tu106/gr/gpccs_bl.bin) firmware(nvidia/tu106/gr/gpccs_data.bin) firmware(nvidia/tu106/gr/gpccs_inst.bin) firmware(nvidia/tu106/gr/gpccs_sig.bin) firmware(nvidia/tu106/gr/sw_bundle_init.bin) firmware(nvidia/tu106/gr/sw_ctx.bin) firmware(nvidia/tu106/gr/sw_method_init.bin) firmware(nvidia/tu106/gr/sw_nonctx.bin) firmware(nvidia/tu106/gr/sw_veid_bundle_init.bin) firmware(nvidia/tu106/nvdec/scrubber.bin) firmware(nvidia/tu106/sec2/desc.bin) firmware(nvidia/tu106/sec2/image.bin) firmware(nvidia/tu106/sec2/sig.bin) firmware(nvidia/tu10x/typec/ccg_boot.cyacd) firmware(nvidia/tu10x/typec/ccg_primary.cyacd) firmware(nvidia/tu10x/typec/ccg_secondary.cyacd) firmware(nvidia/tu116/acr/bl.bin) firmware(nvidia/tu116/acr/ucode_ahesasc.bin) firmware(nvidia/tu116/acr/ucode_asb.bin) firmware(nvidia/tu116/acr/ucode_unload.bin) firmware(nvidia/tu116/acr/unload_bl.bin) firmware(nvidia/tu116/gr/fecs_bl.bin) firmware(nvidia/tu116/gr/fecs_data.bin) firmware(nvidia/tu116/gr/fecs_inst.bin) firmware(nvidia/tu116/gr/fecs_sig.bin) firmware(nvidia/tu116/gr/gpccs_bl.bin) firmware(nvidia/tu116/gr/gpccs_data.bin) firmware(nvidia/tu116/gr/gpccs_inst.bin) firmware(nvidia/tu116/gr/gpccs_sig.bin) firmware(nvidia/tu116/gr/sw_bundle_init.bin) firmware(nvidia/tu116/gr/sw_ctx.bin) firmware(nvidia/tu116/gr/sw_method_init.bin) firmware(nvidia/tu116/gr/sw_nonctx.bin) firmware(nvidia/tu116/gr/sw_veid_bundle_init.bin) firmware(nvidia/tu116/nvdec/scrubber.bin) firmware(nvidia/tu116/sec2/desc.bin) firmware(nvidia/tu116/sec2/image.bin) firmware(nvidia/tu116/sec2/sig.bin) firmware(nvidia/tu117/acr/bl.bin) firmware(nvidia/tu117/acr/ucode_ahesasc.bin) firmware(nvidia/tu117/acr/ucode_asb.bin) firmware(nvidia/tu117/acr/ucode_unload.bin) firmware(nvidia/tu117/acr/unload_bl.bin) firmware(nvidia/tu117/gr/fecs_bl.bin) firmware(nvidia/tu117/gr/fecs_data.bin) firmware(nvidia/tu117/gr/fecs_inst.bin) firmware(nvidia/tu117/gr/fecs_sig.bin) firmware(nvidia/tu117/gr/gpccs_bl.bin) firmware(nvidia/tu117/gr/gpccs_data.bin) firmware(nvidia/tu117/gr/gpccs_inst.bin) firmware(nvidia/tu117/gr/gpccs_sig.bin) firmware(nvidia/tu117/gr/sw_bundle_init.bin) firmware(nvidia/tu117/gr/sw_ctx.bin) firmware(nvidia/tu117/gr/sw_method_init.bin) firmware(nvidia/tu117/gr/sw_nonctx.bin) firmware(nvidia/tu117/gr/sw_veid_bundle_init.bin) firmware(nvidia/tu117/nvdec/scrubber.bin) firmware(nvidia/tu117/sec2/desc.bin) firmware(nvidia/tu117/sec2/image.bin) firmware(nvidia/tu117/sec2/sig.bin) kernel-firmware-nvidia"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
