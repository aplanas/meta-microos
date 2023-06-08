SUMMARY = "Python-based build system"
DESCRIPTION = "Meson is a build system designed to optimise programmer productivity. \
It aims to do this by providing support for software development \
tools and practices, such as unit tests, coverage reports, Valgrind, \
CCache and the like. Supported languages include C, C++, Fortran, \
Java, Rust. Build definitions are written in a non-turing complete \
Domain Specific Language."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "meson-1.1.0-2.1.noarch.rpm"
RPM_HASH = "1960f7e7dfe2802596939250ea900e3de019d266e68f0a9e059b294b91064558457734238e1393d6c7c7be89ce5e947969919118b22b1f0083baffd95758393d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "meson meson-gui python3.10dist(meson) python3dist(meson) rpm_macro(meson) rpm_macro(meson_build) rpm_macro(meson_install) rpm_macro(meson_test)"
RDEPENDS:${PN} += "/usr/bin/python3 ninja python(abi) python3-base"

inherit rpm
