SUMMARY = "A shared library for notmuch"
DESCRIPTION = "The libnotmuch3 package contains shared libraries for notmuch."
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "libnotmuch5-0.37-2.4.aarch64.rpm"
RPM_HASH = "fd57b761812bd429aee8924ebda8d816adcc851dacca8eee3e4769b69f8c3b406da1f02297f092d6a046c7631170add1052f26d1822648d03f490e4f3ab91f3b"

RPROVIDES:${PN} += "libnotmuch.so.5()(64bit) libnotmuch5 libnotmuch5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgmime-3.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) libxapian.so.30()(64bit)"

inherit rpm
