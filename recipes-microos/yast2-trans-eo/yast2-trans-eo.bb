SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Esperanto Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-eo-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "623a80721b6848eceace6a3f7ca78803b35320a40921c7e3b7543e56a339f35f8fd0ff62d5dac1b77b4be72802fab1b7475ff42933576ede8e158417b79ccc7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:eo) yast2-trans-eo"
RDEPENDS:${PN} += ""

inherit rpm
