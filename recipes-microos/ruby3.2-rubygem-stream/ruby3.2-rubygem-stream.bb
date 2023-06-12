SUMMARY = "stream - Extended External Iterators"
DESCRIPTION = "Module Stream defines an interface for external iterators."
LICENSE = "Ruby"

PV = "0.5.5"

RPM_NAME = "ruby3.2-rubygem-stream-0.5.5-1.5.aarch64.rpm"
RPM_HASH = "4e2a1ab98d447195b8e3e5523bfc8cc21f97f0fbc5ae22c7080dc19e5bd3dab58c5edf7c98704f552c2f4fd56a8b3685f7d1074d1108948468c0ae5aacd160a4"

RPROVIDES:${PN} += "ruby3.2-rubygem-stream \
ruby3.2-rubygem-stream(aarch-64) \
rubygem(ruby:3.2.0:stream) \
rubygem(ruby:3.2.0:stream:0) \
rubygem(ruby:3.2.0:stream:0.5) \
rubygem(ruby:3.2.0:stream:0.5.5) \
rubygem(stream)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
