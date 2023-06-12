SUMMARY = "basic schema to customize rime"
DESCRIPTION = "basic schema to customize rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-custom-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "530225c54e3ba136f31da4200c2351654b76bcaeec17e5e6b280b66c488ce2a7c508dd06b3fa13a28f173d45e61ed91b2901e23aba2994f1a538d42e23f754b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-custom"
RDEPENDS:${PN} += ""

inherit rpm
