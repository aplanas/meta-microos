SUMMARY = "Google Cloud Guest OS Login"
DESCRIPTION = "Google Cloud Guest OS Login"
LICENSE = "Apache-2.0"

PV = "20230502.00"

RPM_NAME = "google-guest-oslogin-20230502.00-1.1.aarch64.rpm"
RPM_HASH = "a51edda3d4246d1d3c444ca03c01add00f0aaffa27c45d068f21b641ddb06cf2b257409f7cfef82406916f13b1d0b3c16f5eba317cd4100f40a7106b199d12a9"

RPROVIDES:${PN} += "google-compute-engine-oslogin google-guest-oslogin google-guest-oslogin(aarch-64) libnss_cache_oslogin.so.2()(64bit) libnss_oslogin.so.2()(64bit)"
RDEPENDS:${PN} += "/bin/sh glibc google-guest-configs libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) openssh pam"

inherit rpm
