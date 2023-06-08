SUMMARY = "Wrapper for audio decoding via selectable backends"
DESCRIPTION = "Decode audio files using whichever backend is available. The library \
currently supports: \
 \
- Gstreamer via PyGObject. \
- MAD via the pymad bindings. \
- FFmpeg or Libav via its command-line interface. \
- The standard library wave, aifc, and sunau modules (for \
  uncompressed audio formats)."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-audioread-3.0.0-1.4.noarch.rpm"
RPM_HASH = "0b4bffe4b04541705f51786a2644fa68be7e13a76cf08249543f97d54e3097acabb927570e27cc146dd192624b400d265a0b7eac00f348c0c4a0b4e4e78c8c63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(audioread) python39-audioread python3dist(audioread)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
