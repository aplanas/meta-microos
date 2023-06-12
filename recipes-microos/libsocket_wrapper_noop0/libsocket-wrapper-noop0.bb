SUMMARY = "A library providing dummies for socket_wrapper"
DESCRIPTION = "Applications with the need to call socket_wrapper_enabled() should link against \
-lsocket_wrapper_noop in order to resolve the symbol at link time."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "libsocket_wrapper_noop0-1.4.0-2.3.aarch64.rpm"
RPM_HASH = "e161caa8083e5139c265f2e86034db712585d663d7cf183fdf5b03cae05bff5a7228ea498967027ecd7bb9bacd5354ca813997b0dd908d9a866e881dfb9b5462"

RPROVIDES:${PN} += "libsocket_wrapper_noop.so.0()(64bit) \
libsocket_wrapper_noop0 \
libsocket_wrapper_noop0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
