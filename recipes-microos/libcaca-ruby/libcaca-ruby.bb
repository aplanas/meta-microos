SUMMARY = "Ruby bindings for libcaca"
DESCRIPTION = "All that is needed to use libcaca from ruby code."
LICENSE = "WTFPL"

PV = "0.99.beta20"

RPM_NAME = "libcaca-ruby-0.99.beta20-1.4.aarch64.rpm"
RPM_HASH = "a4949951c20dcf5a9be983f92e0c651a6eeeb1c5b71c143376524521c3a0663885f81376e7b0e848e63778bc793db9defbd59c970df0657cf38a92c0f73889b5"

RPROVIDES:${PN} += "libcaca-ruby libcaca-ruby(aarch-64)"
RDEPENDS:${PN} += "libcaca libcaca.so.0()(64bit) libruby3.2.so.3.2()(64bit) ruby"

inherit rpm
