SUMMARY = "Minimal Finite State Machine"
DESCRIPTION = "There are many finite state machine implementations for Ruby, and they all \
provide a nice DSL for declaring events, exceptions, callbacks, and all kinds \
of niceties in general. \
But if all you want is a finite state machine, look no further: this has less \
than 50 lines of code and provides everything a finite state machine must \
have, and nothing more."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "ruby3.2-rubygem-micromachine-3.0.0-1.17.aarch64.rpm"
RPM_HASH = "3bb24a2cb7e18c140536bf5a877186de7d5140fcd6e8aa2cef443c094f39aa651f45b8252763834306d4cdd62d338094ae5bcecb4820d3d3bbfa9a6d384f2f1d"

RPROVIDES:${PN} += "ruby3.2-rubygem-micromachine ruby3.2-rubygem-micromachine(aarch-64) rubygem(micromachine) rubygem(ruby:3.2.0:micromachine) rubygem(ruby:3.2.0:micromachine:3) rubygem(ruby:3.2.0:micromachine:3.0) rubygem(ruby:3.2.0:micromachine:3.0.0)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
