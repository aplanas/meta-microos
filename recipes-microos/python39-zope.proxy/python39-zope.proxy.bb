SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "Proxies are special objects which serve as mostly-transparent wrappers around \
another object, intervening in the apparent behavior of the wrapped object only \
when necessary to apply the policy (e.g., access checking, location brokering, \
etc.) for which the proxy is responsible."
LICENSE = "ZPL-2.1"

PV = "4.6.1"

RPM_NAME = "python39-zope.proxy-4.6.1-1.4.aarch64.rpm"
RPM_HASH = "d271d51a49d2f08b2a4acbc295aea74de85b85507fd1b0b80c506000246410bb838c5e5612245b381309f8ab4b173af78ecbee2e6add11e0d07cce575a858b23"

RPROVIDES:${PN} += "python3.9dist(zope.proxy) python39-zope.proxy python39-zope.proxy(aarch-64) python3dist(zope.proxy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-zope.interface"

inherit rpm
