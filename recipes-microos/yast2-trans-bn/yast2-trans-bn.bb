SUMMARY = "YaST2 - Bengali Translations"
DESCRIPTION = "YaST2 - Translations for Bengali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-bn-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "b17b0d9f9b109f93aa0991623a2946576b7b6419d003fb4e4aaf9c7090ecf8395756e77a5966bb1e1d27e837dae6d91468c3db95ac08ffcfce22b8f994d50518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:bn) yast2-trans-bn"
RDEPENDS:${PN} += ""

inherit rpm
