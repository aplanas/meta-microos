SUMMARY = "a fast strptime/strftime engine"
DESCRIPTION = "a fast strptime/strftime engine which uses VM."
LICENSE = "BSD-2-Clause"

PV = "0.2.5"

RPM_NAME = "ruby3.2-rubygem-strptime-0.2.5-1.16.aarch64.rpm"
RPM_HASH = "805e743cc7e0239c08b0efb322e5ff8b8fd5afa23224ebcf075edee3423b4e32bb46d4b80f8688a9a9255d51acc0834803929686ed632c2ddb5485fcfbb0f981"

RPROVIDES:${PN} += "ruby3.2-rubygem-strptime ruby3.2-rubygem-strptime(aarch-64) rubygem(ruby:3.2.0:strptime) rubygem(ruby:3.2.0:strptime:0) rubygem(ruby:3.2.0:strptime:0.2) rubygem(ruby:3.2.0:strptime:0.2.5) rubygem(strptime)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/ruby.ruby3.2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libruby3.2.so.3.2()(64bit) ruby(abi)"

inherit rpm
