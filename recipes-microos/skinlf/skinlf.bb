SUMMARY = "Allows developers to write skinnable application using the Swing toolkit"
DESCRIPTION = "Skin Look And Feel allows Java developers to write skinnable application using \
the Swing toolkit. Skin Look And Feel is able to read GTK (The Gimp Toolkit) \
and KDE (The K Desktop Environment) skins to enhance your application GUI \
controls such as Buttons, Checks, Radios, Scrollbars, Progress Bar, Lists, \
Tables, Internal Frames, Colors, Background Textures, Regular Windows. Skin \
Look And Feel (aka SkinLF) also includes NativeSkin to create irregular \
windows."
LICENSE = "Apache-1.1 & Zlib"

PV = "6.7"

RPM_NAME = "skinlf-6.7-9.2.noarch.rpm"
RPM_HASH = "0de83a9e025d8b9394333c79a9e54a18aab34d92809c18754e35be0a3d21d3db5604b491740f8a319bba2d33fe02e5d4c406ff8e3e5173fd0fdb2efc6ba14d4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skinlf"
RDEPENDS:${PN} += "java jpackage-utils laf-plugin xalan-j2"

inherit rpm
