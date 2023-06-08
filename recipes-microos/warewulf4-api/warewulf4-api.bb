SUMMARY = "Contains the service for the warewulf rest API"
DESCRIPTION = "Containts the binaries for the access of warewulf through a rest API and from the commandline from an external host."
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "warewulf4-api-4.4.0-6.3.aarch64.rpm"
RPM_HASH = "c491a1e5791791160d8997c3370630f21fee5d6dbb95f8be97209ecdb94458351b117e2cc42086525e95a53f7b6d0dfa5b0609108e407e6dd28efccabc4a7184"

RPROVIDES:${PN} += "config(warewulf4-api) warewulf4-api warewulf4-api(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgpgme.so.11()(64bit) libgpgme.so.11(GPGME_1.0)(64bit) libgpgme.so.11(GPGME_1.1)(64bit) warewulf4"

inherit rpm
