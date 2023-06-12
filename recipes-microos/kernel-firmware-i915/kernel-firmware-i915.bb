SUMMARY = "Kernel firmware files for Intel i915 graphics driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Intel i915 graphics driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-i915-20230517-1.1.noarch.rpm"
RPM_HASH = "e269bc49c7716009ef72aba6bf81cfb1599eac06f340416f60d3de5cf5769dfc6e23ebe48d87e584fece50f60ee1f62d81e6c086ff802f2ba7db2998b969c5de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(i915/adlp_dmc.bin) \
firmware(i915/adlp_dmc_ver2_09.bin) \
firmware(i915/adlp_dmc_ver2_10.bin) \
firmware(i915/adlp_dmc_ver2_12.bin) \
firmware(i915/adlp_dmc_ver2_14.bin) \
firmware(i915/adlp_dmc_ver2_16.bin) \
firmware(i915/adlp_guc_62.0.3.bin) \
firmware(i915/adlp_guc_69.0.3.bin) \
firmware(i915/adlp_guc_70.1.1.bin) \
firmware(i915/adlp_guc_70.bin) \
firmware(i915/adls_dmc_ver2_01.bin) \
firmware(i915/bxt_dmc_ver1.bin) \
firmware(i915/bxt_dmc_ver1_07.bin) \
firmware(i915/bxt_guc_32.0.3.bin) \
firmware(i915/bxt_guc_33.0.0.bin) \
firmware(i915/bxt_guc_49.0.1.bin) \
firmware(i915/bxt_guc_62.0.0.bin) \
firmware(i915/bxt_guc_69.0.3.bin) \
firmware(i915/bxt_guc_70.1.1.bin) \
firmware(i915/bxt_guc_ver8_7.bin) \
firmware(i915/bxt_guc_ver9_29.bin) \
firmware(i915/bxt_huc_2.0.0.bin) \
firmware(i915/bxt_huc_ver01_07_1398.bin) \
firmware(i915/bxt_huc_ver01_8_2893.bin) \
firmware(i915/cml_guc_33.0.0.bin) \
firmware(i915/cml_guc_49.0.1.bin) \
firmware(i915/cml_guc_62.0.0.bin) \
firmware(i915/cml_guc_69.0.3.bin) \
firmware(i915/cml_guc_70.1.1.bin) \
firmware(i915/cml_huc_4.0.0.bin) \
firmware(i915/cnl_dmc_ver1_06.bin) \
firmware(i915/cnl_dmc_ver1_07.bin) \
firmware(i915/dg1_dmc_ver2_02.bin) \
firmware(i915/dg1_guc_49.0.1.bin) \
firmware(i915/dg1_guc_62.0.0.bin) \
firmware(i915/dg1_guc_69.0.3.bin) \
firmware(i915/dg1_guc_70.1.1.bin) \
firmware(i915/dg1_guc_70.bin) \
firmware(i915/dg1_huc.bin) \
firmware(i915/dg1_huc_7.7.1.bin) \
firmware(i915/dg1_huc_7.9.3.bin) \
firmware(i915/dg2_dmc_ver2_06.bin) \
firmware(i915/dg2_dmc_ver2_07.bin) \
firmware(i915/dg2_dmc_ver2_08.bin) \
firmware(i915/dg2_guc_70.1.2.bin) \
firmware(i915/dg2_guc_70.4.1.bin) \
firmware(i915/dg2_guc_70.bin) \
firmware(i915/dg2_huc_gsc.bin) \
firmware(i915/ehl_guc_33.0.4.bin) \
firmware(i915/ehl_guc_49.0.1.bin) \
firmware(i915/ehl_guc_62.0.0.bin) \
firmware(i915/ehl_guc_69.0.3.bin) \
firmware(i915/ehl_guc_70.1.1.bin) \
firmware(i915/ehl_huc_9.0.0.bin) \
firmware(i915/glk_dmc_ver1_04.bin) \
firmware(i915/glk_guc_32.0.3.bin) \
firmware(i915/glk_guc_33.0.0.bin) \
firmware(i915/glk_guc_49.0.1.bin) \
firmware(i915/glk_guc_62.0.0.bin) \
firmware(i915/glk_guc_69.0.3.bin) \
firmware(i915/glk_guc_70.1.1.bin) \
firmware(i915/glk_huc_4.0.0.bin) \
firmware(i915/glk_huc_ver03_01_2893.bin) \
firmware(i915/icl_dmc_ver1_07.bin) \
firmware(i915/icl_dmc_ver1_09.bin) \
firmware(i915/icl_guc_32.0.3.bin) \
firmware(i915/icl_guc_33.0.0.bin) \
firmware(i915/icl_guc_49.0.1.bin) \
firmware(i915/icl_guc_62.0.0.bin) \
firmware(i915/icl_guc_69.0.3.bin) \
firmware(i915/icl_guc_70.1.1.bin) \
firmware(i915/icl_huc_9.0.0.bin) \
firmware(i915/icl_huc_ver8_4_3238.bin) \
firmware(i915/kbl_dmc_ver1.bin) \
firmware(i915/kbl_dmc_ver1_01.bin) \
firmware(i915/kbl_dmc_ver1_04.bin) \
firmware(i915/kbl_guc_32.0.3.bin) \
firmware(i915/kbl_guc_33.0.0.bin) \
firmware(i915/kbl_guc_49.0.1.bin) \
firmware(i915/kbl_guc_62.0.0.bin) \
firmware(i915/kbl_guc_69.0.3.bin) \
firmware(i915/kbl_guc_70.1.1.bin) \
firmware(i915/kbl_guc_ver9_14.bin) \
firmware(i915/kbl_guc_ver9_39.bin) \
firmware(i915/kbl_huc_4.0.0.bin) \
firmware(i915/kbl_huc_ver02_00_1810.bin) \
firmware(i915/mtl_dmc.bin) \
firmware(i915/mtl_dmc_ver2_10.bin) \
firmware(i915/mtl_guc_70.bin) \
firmware(i915/rkl_dmc_ver2_02.bin) \
firmware(i915/rkl_dmc_ver2_03.bin) \
firmware(i915/skl_dmc_ver1.bin) \
firmware(i915/skl_dmc_ver1_23.bin) \
firmware(i915/skl_dmc_ver1_26.bin) \
firmware(i915/skl_dmc_ver1_27.bin) \
firmware(i915/skl_guc_32.0.3.bin) \
firmware(i915/skl_guc_33.0.0.bin) \
firmware(i915/skl_guc_49.0.1.bin) \
firmware(i915/skl_guc_62.0.0.bin) \
firmware(i915/skl_guc_69.0.3.bin) \
firmware(i915/skl_guc_70.1.1.bin) \
firmware(i915/skl_guc_ver1.bin) \
firmware(i915/skl_guc_ver4.bin) \
firmware(i915/skl_guc_ver6.bin) \
firmware(i915/skl_guc_ver6_1.bin) \
firmware(i915/skl_guc_ver9_33.bin) \
firmware(i915/skl_huc_2.0.0.bin) \
firmware(i915/skl_huc_ver01_07_1398.bin) \
firmware(i915/tgl_dmc_ver2_04.bin) \
firmware(i915/tgl_dmc_ver2_06.bin) \
firmware(i915/tgl_dmc_ver2_08.bin) \
firmware(i915/tgl_dmc_ver2_12.bin) \
firmware(i915/tgl_guc_35.2.0.bin) \
firmware(i915/tgl_guc_49.0.1.bin) \
firmware(i915/tgl_guc_62.0.0.bin) \
firmware(i915/tgl_guc_69.0.3.bin) \
firmware(i915/tgl_guc_70.1.1.bin) \
firmware(i915/tgl_guc_70.bin) \
firmware(i915/tgl_huc.bin) \
firmware(i915/tgl_huc_7.0.12.bin) \
firmware(i915/tgl_huc_7.0.3.bin) \
firmware(i915/tgl_huc_7.5.0.bin) \
firmware(i915/tgl_huc_7.9.3.bin) \
kernel-firmware-i915"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
