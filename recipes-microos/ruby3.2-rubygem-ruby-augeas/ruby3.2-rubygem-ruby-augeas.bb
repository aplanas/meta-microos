SUMMARY = "Ruby bindings for augeas"
DESCRIPTION = "Provides bindings for augeas."
LICENSE = "LGPL-2.1+"

PV = "0.5.0"

RPM_NAME = "ruby3.2-rubygem-ruby-augeas-0.5.0-3.36.aarch64.rpm"
RPM_HASH = "ab9e33cec43160606eaeece81e4427b53692666b59671dad66cc4865fb5681e84c89d6a55a0fd233c13a4d45e9d63b4b275bd9f14577e27e329eb2e0f6b4ffb2"

RPROVIDES:${PN} += "ruby3.2-rubygem-ruby-augeas ruby3.2-rubygem-ruby-augeas(aarch-64) rubygem(ruby-augeas) rubygem(ruby:3.2.0:ruby-augeas) rubygem(ruby:3.2.0:ruby-augeas:0) rubygem(ruby:3.2.0:ruby-augeas:0.5) rubygem(ruby:3.2.0:ruby-augeas:0.5.0)"
RDEPENDS:${PN} += "augeas ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaugeas.so.0()(64bit) libaugeas.so.0(AUGEAS_0.1.0)(64bit) libaugeas.so.0(AUGEAS_0.10.0)(64bit) libaugeas.so.0(AUGEAS_0.11.0)(64bit) libaugeas.so.0(AUGEAS_0.12.0)(64bit) libaugeas.so.0(AUGEAS_0.14.0)(64bit) libaugeas.so.0(AUGEAS_0.16.0)(64bit) libaugeas.so.0(AUGEAS_0.8.0)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libruby3.2.so.3.2()(64bit) libxml2.so.2()(64bit) ruby(abi)"

inherit rpm
