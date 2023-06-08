SUMMARY = "A fast and flexible HTML Parser"
DESCRIPTION = "Hpricot is a flexible HTML parser written in C. It's designed to be similar to Tanaka Akira's HTree, and has a library. Hpricot can read broken XML files, since many of the same techniques can be used."
LICENSE = "MIT"

PV = "0.8.6"

RPM_NAME = "ruby3.2-rubygem-hpricot-0.8.6-2.29.aarch64.rpm"
RPM_HASH = "492c66a3d1f3b5e1fe0db2b614a7bb0ef7666295d113cbf5d0ace2be64fa799b889fa1561b9c3bc117b65276da90dd9eab6b23a8421228c19ffc3fe67faee6b1"

RPROVIDES:${PN} += "ruby3.2-rubygem-hpricot ruby3.2-rubygem-hpricot(aarch-64) rubygem(hpricot) rubygem(ruby:3.2.0:hpricot) rubygem(ruby:3.2.0:hpricot:0) rubygem(ruby:3.2.0:hpricot:0.8) rubygem(ruby:3.2.0:hpricot:0.8.6)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libruby3.2.so.3.2()(64bit) ruby(abi)"

inherit rpm
