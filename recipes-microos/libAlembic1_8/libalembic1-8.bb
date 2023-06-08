SUMMARY = "Sparse volume data structure library"
DESCRIPTION = "Alembic distills complex, animated scenes into a non-procedural, application- \
independent set of baked geometric results. This ‘distillation’ of scenes into \
baked geometry is exactly analogous to the distillation of lighting and \
rendering scenes into rendered image data."
LICENSE = "BSD-3-Clause"

PV = "1.8.4"

RPM_NAME = "libAlembic1_8-1.8.4-1.3.aarch64.rpm"
RPM_HASH = "94d7805c5410190bb13ea8935a063356a832b87be3d738e99cf53f9cb9fbcf3f91bb6784e739f12a65e1f8dd50cf7f1078c01b93f5717fe3e24b9eaea6844eea"

RPROVIDES:${PN} += "libAlembic.so.1.8()(64bit) libAlembic1_8 libAlembic1_8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libImath-3_1.so.29()(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
