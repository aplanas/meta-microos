SUMMARY = "Sway Tiling Wayland Compositor and related tools"
DESCRIPTION = "Sway Tiling Wayland Compositor and related tools."
LICENSE = "MIT"

PV = "20200619"

RPM_NAME = "patterns-sway-sway-20200619-5.3.aarch64.rpm"
RPM_HASH = "7a18b15e59f2f3dac217a4ea0649a7c85c53e272ddc22289f52564ff265ab18e3a5005703b01dd82f1f121590f640cb0d23a72b6e8b95d6d5ba2aefc41e5af6c"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-sway-sway patterns-sway-sway(aarch-64)"
RDEPENDS:${PN} += "Mesa alacritty fontawesome-fonts grim mako slurp sway swaybg swayidle swaylock waybar wofi"

inherit rpm
