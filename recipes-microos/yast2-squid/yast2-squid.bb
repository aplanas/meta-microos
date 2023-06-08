SUMMARY = "Configuration of squid"
DESCRIPTION = "Configuration of squid"
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-squid-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "c08cdb85ef9d5a4e8fdb6dd4382388bdcdf3f0be1dce3b6fb5c6f6861e4ab26fc4cfd6a848567aa7e687562594019f3c62243ce90ee79dc590b18187f996dcda"

RPROVIDES:${PN} += "application() application(org.opensuse.yast.Squid.desktop) libpy2ag_squid.so.2()(64bit) metainfo() metainfo(org.opensuse.yast.Squid.metainfo.xml) yast2-squid yast2-squid(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libscr.so.3()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) liby2.so.4()(64bit) liby2util.so.5()(64bit) libycp.so.5()(64bit) libycpvalues.so.6()(64bit) yast2 yast2-ruby-bindings"

inherit rpm
