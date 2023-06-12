SUMMARY = "Help and Support Documentation"
DESCRIPTION = "Help and Support Documentation"
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-documentation-20200505-41.1.aarch64.rpm"
RPM_HASH = "db90fbffafa4b40291e8325c49ced4931e1cb8f2c0161ad2d287fbaa3ebbb8acec66521154d608ecee70eb5bc16e659e5a5049c417e781a59b15441749bdf6a6"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-documentation patterns-base-documentation(aarch-64) patterns-openSUSE-documentation"
RDEPENDS:${PN} += "man pattern()"

inherit rpm
