SUMMARY = "MessagePack, a binary-based efficient data interchange format"
DESCRIPTION = "MessagePack is a binary-based efficient object serialization library. It \
enables to exchange structured objects between many languages like JSON. But \
unlike JSON, it is very fast and small."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "ruby3.2-rubygem-msgpack-1.6.0-1.6.aarch64.rpm"
RPM_HASH = "4977bb212bde8b87ca0ad079a8e9b372ce71c726d43fee121507ac6fdff91059b36bb7342ff42d9057170197c25cba2206ad70fc9617e6901f1c7dbc70ad4746"

RPROVIDES:${PN} += "ruby3.2-rubygem-msgpack ruby3.2-rubygem-msgpack(aarch-64) rubygem(msgpack) rubygem(ruby:3.2.0:msgpack) rubygem(ruby:3.2.0:msgpack:1) rubygem(ruby:3.2.0:msgpack:1.6) rubygem(ruby:3.2.0:msgpack:1.6.0)"
RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libruby3.2.so.3.2()(64bit) ruby(abi)"

inherit rpm
