SUMMARY = "YaST2 - Finnish Translations"
DESCRIPTION = "YaST2 - Finnish translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-fi-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "f5c9e92d0629f6db17e2ee50395abdeb083e797fa2252e238f4b96c81b2bef85253d7a68090a0d7e2b75edc2819711315682cea9a8a8615f7f1ebc4cfeb67fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:fi) yast2-trans-fi"
RDEPENDS:${PN} += ""

inherit rpm
