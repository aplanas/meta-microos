SUMMARY = "A virtual machine for Haxe"
DESCRIPTION = "HashLink is a virtual machine for Haxe. \
Haxe supports two modes of compilation for HashLink: \
* Compilation to HashLink bytecode. This mode has a very fast compilation time, \
  so it is suitable for daily development. \
* Compilation to HashLink/C code, compiled with a native compiler to a regular \
  executable. This mode results in the best performance, so it is suitable for \
  final releases."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "hashlink-1.13-1.3.aarch64.rpm"
RPM_HASH = "477c94adf9defd0f751d4d48cecf17bc56423a1f48cf9b2331f253d584a8d643cc90706fca3d7c61127933c827c359186f57cc6da3fecbbd579b8fc09ff9cc7e"

RPROVIDES:${PN} += "hashlink \
hashlink(aarch-64)"
RDEPENDS:${PN} += "hashlink-hdlls"

inherit rpm
