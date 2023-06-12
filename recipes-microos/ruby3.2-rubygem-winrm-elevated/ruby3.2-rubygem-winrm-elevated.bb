SUMMARY = "Ruby library for running commands as elevated"
DESCRIPTION = "Ruby library for running commands via WinRM as elevated through a scheduled \
task."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "ruby3.2-rubygem-winrm-elevated-1.2.3-1.13.aarch64.rpm"
RPM_HASH = "4833dc71e38fde56f63d2989f73ef76f14b53d5275b386e4b666f47692a87a4eb747b8081a7c51fcdbde33a3f1dacbb900a3ccdeaab6fbdd2ee5b91e9cb5e275"

RPROVIDES:${PN} += "ruby3.2-rubygem-winrm-elevated \
ruby3.2-rubygem-winrm-elevated(aarch-64) \
rubygem(ruby:3.2.0:winrm-elevated) \
rubygem(ruby:3.2.0:winrm-elevated:1) \
rubygem(ruby:3.2.0:winrm-elevated:1.2) \
rubygem(ruby:3.2.0:winrm-elevated:1.2.3) \
rubygem(winrm-elevated)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:erubi:1) \
rubygem(ruby:3.2.0:winrm-fs:1) \
rubygem(ruby:3.2.0:winrm:2)"

inherit rpm
