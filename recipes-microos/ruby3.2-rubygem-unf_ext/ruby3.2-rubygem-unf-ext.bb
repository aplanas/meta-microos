SUMMARY = "Unicode Normalization Form support library for CRuby"
DESCRIPTION = "Unicode Normalization Form support library for CRuby."
LICENSE = "MIT"

PV = "0.0.8.2"

RPM_NAME = "ruby3.2-rubygem-unf_ext-0.0.8.2-1.7.aarch64.rpm"
RPM_HASH = "ab21e1257fb7672f59828d51c7e9c728f9311d144942cda6b79871824e9c0a4d8c3232de64c1d77d0117a558a4a75ce07d501c84c8d0137bd739a9473bc56943"

RPROVIDES:${PN} += "ruby3.2-rubygem-unf_ext ruby3.2-rubygem-unf_ext(aarch-64) rubygem(ruby:3.2.0:unf_ext) rubygem(ruby:3.2.0:unf_ext:0) rubygem(ruby:3.2.0:unf_ext:0.0) rubygem(ruby:3.2.0:unf_ext:0.0.8) rubygem(unf_ext)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libm.so.6()(64bit) libruby3.2.so.3.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ruby(abi)"

inherit rpm
