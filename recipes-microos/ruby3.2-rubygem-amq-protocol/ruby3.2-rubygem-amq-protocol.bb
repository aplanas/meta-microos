SUMMARY = "AMQP 0.9.1 encoding & decoding library"
DESCRIPTION = "amq-protocol is an AMQP 0.9.1 serialization library for Ruby. It is not a \
client: the library only handles serialization and deserialization."
LICENSE = "MIT"

PV = "2.3.2"

RPM_NAME = "ruby3.2-rubygem-amq-protocol-2.3.2-1.15.aarch64.rpm"
RPM_HASH = "bda13a2ac61e9f096e59a4da62b036c74d8c1705b3610a4bd528150cbb18d9fca6599e11ca95f133fc5d771ea0dde49b811e0b067986a4e75e6e18133de95ba5"

RPROVIDES:${PN} += "ruby3.2-rubygem-amq-protocol \
ruby3.2-rubygem-amq-protocol(aarch-64) \
rubygem(amq-protocol) \
rubygem(ruby:3.2.0:amq-protocol) \
rubygem(ruby:3.2.0:amq-protocol:2) \
rubygem(ruby:3.2.0:amq-protocol:2.3) \
rubygem(ruby:3.2.0:amq-protocol:2.3.2)"
RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/ruby.ruby3.2 \
ruby(abi)"

inherit rpm
