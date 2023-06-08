SUMMARY = "Cross-vendor public domain suffix database"
DESCRIPTION = "The Public Suffix List is a cross-vendor initiative to provide \
an accurate list of domain name suffixes, maintained by the hard work \
of Mozilla volunteers and by submissions from registries. \
Software using the Public Suffix List will be able to determine where \
cookies may and may not be set, protecting the user from being \
tracked across sites."
LICENSE = "MPL-2.0"

PV = "20230426"

RPM_NAME = "publicsuffix-20230426-1.1.noarch.rpm"
RPM_HASH = "c96a210023513dd1cb874c3e6d1f9de008ca075973216462506b5f89dad85e90d0328093c8a103e648a0556dddbbd8a9670dc6611e9361b03d76e080157e511b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "publicsuffix"
RDEPENDS:${PN} += ""

inherit rpm
