SUMMARY = "Enhanced Base System"
DESCRIPTION = "This is the enhanced base runtime system with lots of convenience packages."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-enhanced_base-20200505-40.1.aarch64.rpm"
RPM_HASH = "0086698593e10adf4141b145934e0d4a5552eba67018e59d40f5eceb60db238dcc661e0d25424c5c9cc248a19fe73aad523ba947d73dce62bca8eea37deb3caf"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-base-enhanced_base patterns-base-enhanced_base(aarch-64) patterns-openSUSE-enhanced_base"
RDEPENDS:${PN} += "openssh pattern()"

inherit rpm
