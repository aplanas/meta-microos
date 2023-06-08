SUMMARY = "Plymouth 'Breeze' theme"
DESCRIPTION = "This package contains the 'breeze' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0+"

PV = "5.27.4"

RPM_NAME = "plymouth-theme-breeze-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "7b8a1b11ba2fa91bebbcddcc1167acd29abce7f991855c2e69f4c65f8e3843d5eef5684223770bd7eebb67ac078ef561d9df34860b42c4f5309c8228b45e8a4a"

RPROVIDES:${PN} += "plymouth-theme-breeze plymouth-theme-breeze(aarch-64)"
RDEPENDS:${PN} += "plymouth-plugin-label-ft plymouth-scripts plymouth-theme-breeze-plugin-breeze"

inherit rpm
