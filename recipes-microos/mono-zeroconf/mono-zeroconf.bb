SUMMARY = "A cross platform Zero Configuration Networking library for Mono"
DESCRIPTION = "Mono.Zeroconf is a cross platform Zero Configuration Networking library \
for Mono and .NET. It provides a unified API for performing the most \
common zeroconf operations on a variety of platforms and subsystems: \
all the operating systems supported by Mono and both the Avahi and \
Bonjour/mDNSResponder transports. \
 \
 \
 \
Authors: \
-------- \
    Aaron Bockover <abockover@novell.com>"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "mono-zeroconf-0.9.0-22.18.noarch.rpm"
RPM_HASH = "5eff6ec8aadb737de68ade72baad2d5fa80af0e19d3aca33ba3d2d54e56bd7b95a4abdc95f23c72a2fa61785fbbc7cd997d215f48a20b49741392468325732b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono(MZClient) mono(Mono.Zeroconf) mono(policy.1.0.Mono.Zeroconf) mono(policy.2.0.Mono.Zeroconf) mono(policy.3.0.Mono.Zeroconf) mono(policy.4.0.Mono.Zeroconf) mono-zeroconf"
RDEPENDS:${PN} += "/bin/bash mono(System) mono(mscorlib) mono-zeroconf-provider"

inherit rpm
