SUMMARY = "Implementation of SA Forum's Hardware Platform Interface (HPI)"
DESCRIPTION = "OpenHPI implements the SA Forum's Hardware Platform Interface (HPI). HPI is an \
abstracted interface for managing computer hardware, typically for chassis and \
rack based servers."
LICENSE = "BSD-3-Clause"

PV = "3.8.0.ge4631e8a"

RPM_NAME = "openhpi-daemon-3.8.0.ge4631e8a-3.4.aarch64.rpm"
RPM_HASH = "3aa202b9f0f9d2f9fa0ebc9651849dcba512b18e0f4d6eda4df62a61bad94937569808ef0d4a30712474c491c9b277f5b8f9ea51353ae9af5a80d75c84ea35ee"

RPROVIDES:${PN} += "openhpi-daemon \
openhpi-daemon(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libopenhpi_ssl.so.4()(64bit) \
libopenhpimarshal.so.4()(64bit) \
libopenhpitransport.so.4()(64bit) \
libopenhpiutils.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
openhpi \
systemd"

inherit rpm
