SUMMARY = "Python bindings for the FreeIPA HBAC Evaluator library"
DESCRIPTION = "The python-ipa_hbac package contains the bindings so that libipa_hbac \
can be used by Python applications."
LICENSE = "LGPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "python3-ipa_hbac-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "bb60293a05eea3cbb41c0f2c8c4aa39e4a569d711e89e721a3cf2235eeb2bc028487e473165b8d1052f2a95e7cc5685a43ada7220e1aafac31197ef05098e4df"

RPROVIDES:${PN} += "python3-ipa_hbac python3-ipa_hbac(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libipa_hbac.so.0()(64bit) libipa_hbac.so.0(IPA_HBAC_0.0.1)(64bit) python(abi) python3"

inherit rpm
