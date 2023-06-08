SUMMARY = "Implementation of SA Forum's Hardware Platform Interface (HPI)"
DESCRIPTION = "OpenHPI implements the SA Forum's Hardware Platform Interface (HPI). HPI is an \
abstracted interface for managing computer hardware, typically for chassis and \
rack based servers. HPI includes a resource model; access to and control over \
sensor, control, watchdog, and inventory data associated with resources; \
abstracted System Event Log interfaces; hardware events and alerts; and a \
managed hotswap interface. \
 \
OpenHPI provides a modular mechanism for adding new hardware and device \
support. Plug-ins exist for providing access to various types of hardware, \
including IPMI-based servers, Blade Center, and machines that export data via \
sysfs."
LICENSE = "BSD-3-Clause"

PV = "3.8.0.ge4631e8a"

RPM_NAME = "openhpi-3.8.0.ge4631e8a-3.4.aarch64.rpm"
RPM_HASH = "4cd713275ab343e46d8d7ad3a89698d11992dec84c6939e73a89c8e02c0e4dab4e4ddce4bc371b4b5a9f35a63768c77050f03a3f74bbf4a30c8cae87a15037e3"

RPROVIDES:${PN} += "config(openhpi) libdyn_simulator.so.4()(64bit) libilo2_ribcl.so.4()(64bit) libipmidirect.so.4()(64bit) liboa_soap.so.4()(64bit) libsimulator.so.4()(64bit) libslave.so.4()(64bit) libtest_agent.so.4()(64bit) libwatchdog.so.4()(64bit) openhpi openhpi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenhpiutils.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
