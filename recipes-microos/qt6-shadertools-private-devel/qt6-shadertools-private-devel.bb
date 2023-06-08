SUMMARY = "Non-ABI stable API for the Qt 6 ShaderTools library"
DESCRIPTION = "This package provides private headers of libQt6ShaderTools that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-shadertools-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "799cd8798f4ddd71f498ee506f6c5c07abc0865f219805bf9ce5d6ba1ed3143fbf80d2e4ffcb862451ab6936986f017b3879511ec2975c06d2590e6b99885222"

RPROVIDES:${PN} += "qt6-shadertools-private-devel qt6-shadertools-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6ShaderTools) qt6-core-private-devel"

inherit rpm
