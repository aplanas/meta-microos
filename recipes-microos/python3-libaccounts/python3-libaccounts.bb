SUMMARY = "Python bindings for the Account management library"
DESCRIPTION = "This package contains the python bindings for the account \
management library."
LICENSE = "LGPL-2.1-only"

PV = "1.26"

RPM_NAME = "python3-libaccounts-1.26-1.3.aarch64.rpm"
RPM_HASH = "026f9fbf432cc0cfbf01478d9f8f2f99ad98f35fe8916c693cf7a85328758464d42b378891d4f2ee9b9c04e322df379401f8c69e4bcedb89a95d813cc9d91a32"

RPROVIDES:${PN} += "python3-libaccounts python3-libaccounts(aarch-64)"
RDEPENDS:${PN} += "python(abi) typelib(GObject)"

inherit rpm
