SUMMARY = "Python bindings for the omniORB CORBA implementation"
DESCRIPTION = "omniORB is a robust high performance CORBA ORB for C++ and Python."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "omniORBpy-4.3.0-1.8.aarch64.rpm"
RPM_HASH = "7f0f7c13fa126c51a0c844f8acb8d068add903e14d4e558e2eed1ed852f6bc7dad22418e0fa7c8fcb9f655bf2d064104fbec67cf2f9f11282e3ac10d96d6dc04"

RPROVIDES:${PN} += "omniORBpy omniORBpy(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libomniCodeSets4.so.3()(64bit) libomniConnectionMgmt4.so.3()(64bit) libomniORB4.so.3()(64bit) libomniZIOP4.so.3()(64bit) libomnithread.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi)"

inherit rpm
