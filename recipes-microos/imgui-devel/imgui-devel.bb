SUMMARY = "Development files for ImGui"
DESCRIPTION = "ImGui is self-contained within a few files that you can easily copy and compile \
into your application/engine. \
 \
No specific build process is required. You can add the .cpp files to your \
project or #include them from an existing file."
LICENSE = "MIT"

PV = "1.89.2"

RPM_NAME = "imgui-devel-1.89.2-1.1.aarch64.rpm"
RPM_HASH = "6f42e102f123294e6e88ee10a8b0db924fdb4f479d6d953255f56fe1c0084fa7d7a308b7d4a59d13a5f6292222fa5874406f00667d7074e7cf46bdf99e02d277"

RPROVIDES:${PN} += "imgui-devel imgui-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
