SUMMARY = "An abstract OAuth2 strategy for OmniAuth"
DESCRIPTION = "An abstract OAuth2 strategy for OmniAuth."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "ruby3.2-rubygem-omniauth-oauth2-1.8.0-1.5.aarch64.rpm"
RPM_HASH = "c8be520df6da6fd42044eed9d55ce6dc28660ed411d54c2134034c81fe34810368defdce4bef3b1f6163974491b215e465cfc0c308e1d7b17edd395d4e8bc674"

RPROVIDES:${PN} += "ruby3.2-rubygem-omniauth-oauth2 ruby3.2-rubygem-omniauth-oauth2(aarch-64) rubygem(omniauth-oauth2) rubygem(ruby:3.2.0:omniauth-oauth2) rubygem(ruby:3.2.0:omniauth-oauth2:1) rubygem(ruby:3.2.0:omniauth-oauth2:1.8) rubygem(ruby:3.2.0:omniauth-oauth2:1.8.0)"
RDEPENDS:${PN} += "/usr/bin/env ruby(abi) rubygem(ruby:3.2.0:oauth2) rubygem(ruby:3.2.0:omniauth:2)"

inherit rpm
