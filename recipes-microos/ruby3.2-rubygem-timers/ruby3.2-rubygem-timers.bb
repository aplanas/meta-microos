SUMMARY = "Pure Ruby one-shot and periodic timers"
DESCRIPTION = "Pure Ruby one-shot and periodic timers."
LICENSE = "MIT"

PV = "4.3.5"

RPM_NAME = "ruby3.2-rubygem-timers-4.3.5-1.5.aarch64.rpm"
RPM_HASH = "26a17dedd8fe9316978d9967bd85060dfeb9c60e5d433d207bf7d2ef3b65cfecbd95d37559ba51525084ffd2678100de2215404560e97b6400f2dbdee82a3082"

RPROVIDES:${PN} += "ruby3.2-rubygem-timers ruby3.2-rubygem-timers(aarch-64) rubygem(ruby:3.2.0:timers) rubygem(ruby:3.2.0:timers:4) rubygem(ruby:3.2.0:timers:4.3) rubygem(ruby:3.2.0:timers:4.3.5) rubygem(timers)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
