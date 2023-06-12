SUMMARY = "Linux Studio Plugins Project (Stand-alone)"
DESCRIPTION = "LSP (Linux Studio Plugins) is a collection of open-source plugins \
currently compatible with LADSPA, LV2, CLAP and LinuxVST formats. \
 \
The basic idea is to fill the lack of good and useful plugins under \
the GNU/Linux platform."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "lsp-plugins-1.2.7-1.1.aarch64.rpm"
RPM_HASH = "4c9855a840390327d5b482a2264eb41a03a5013d2b8881aaafc09dbd1b3f7c45c85412af3c4f696882855c0bae100fb913a6a14e6ab64921811080cc7684f8f0"

RPROVIDES:${PN} += "application() \
application(in.lsp_plug.lsp_plugins_ab_tester_x2_mono.desktop) \
application(in.lsp_plug.lsp_plugins_ab_tester_x2_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_ab_tester_x4_mono.desktop) \
application(in.lsp_plug.lsp_plugins_ab_tester_x4_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_ab_tester_x8_mono.desktop) \
application(in.lsp_plug.lsp_plugins_ab_tester_x8_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_art_delay_mono.desktop) \
application(in.lsp_plug.lsp_plugins_art_delay_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_comp_delay_mono.desktop) \
application(in.lsp_plug.lsp_plugins_comp_delay_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_comp_delay_x2_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_compressor_lr.desktop) \
application(in.lsp_plug.lsp_plugins_compressor_mono.desktop) \
application(in.lsp_plug.lsp_plugins_compressor_ms.desktop) \
application(in.lsp_plug.lsp_plugins_compressor_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_crossover_lr.desktop) \
application(in.lsp_plug.lsp_plugins_crossover_mono.desktop) \
application(in.lsp_plug.lsp_plugins_crossover_ms.desktop) \
application(in.lsp_plug.lsp_plugins_crossover_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_dyna_processor_lr.desktop) \
application(in.lsp_plug.lsp_plugins_dyna_processor_mono.desktop) \
application(in.lsp_plug.lsp_plugins_dyna_processor_ms.desktop) \
application(in.lsp_plug.lsp_plugins_dyna_processor_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_expander_lr.desktop) \
application(in.lsp_plug.lsp_plugins_expander_mono.desktop) \
application(in.lsp_plug.lsp_plugins_expander_ms.desktop) \
application(in.lsp_plug.lsp_plugins_expander_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_gate_lr.desktop) \
application(in.lsp_plug.lsp_plugins_gate_mono.desktop) \
application(in.lsp_plug.lsp_plugins_gate_ms.desktop) \
application(in.lsp_plug.lsp_plugins_gate_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_graph_equalizer_x16_lr.desktop) \
application(in.lsp_plug.lsp_plugins_graph_equalizer_x16_mono.desktop) \
application(in.lsp_plug.lsp_plugins_graph_equalizer_x16_ms.desktop) \
application(in.lsp_plug.lsp_plugins_graph_equalizer_x16_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_graph_equalizer_x32_lr.desktop) \
application(in.lsp_plug.lsp_plugins_graph_equalizer_x32_mono.desktop) \
application(in.lsp_plug.lsp_plugins_graph_equalizer_x32_ms.desktop) \
application(in.lsp_plug.lsp_plugins_graph_equalizer_x32_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_impulse_responses_mono.desktop) \
application(in.lsp_plug.lsp_plugins_impulse_responses_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_impulse_reverb_mono.desktop) \
application(in.lsp_plug.lsp_plugins_impulse_reverb_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_latency_meter.desktop) \
application(in.lsp_plug.lsp_plugins_limiter_mono.desktop) \
application(in.lsp_plug.lsp_plugins_limiter_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_loud_comp_mono.desktop) \
application(in.lsp_plug.lsp_plugins_loud_comp_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_mb_compressor_lr.desktop) \
application(in.lsp_plug.lsp_plugins_mb_compressor_mono.desktop) \
application(in.lsp_plug.lsp_plugins_mb_compressor_ms.desktop) \
application(in.lsp_plug.lsp_plugins_mb_compressor_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_mb_dyna_processor_lr.desktop) \
application(in.lsp_plug.lsp_plugins_mb_dyna_processor_mono.desktop) \
application(in.lsp_plug.lsp_plugins_mb_dyna_processor_ms.desktop) \
application(in.lsp_plug.lsp_plugins_mb_dyna_processor_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_mb_expander_lr.desktop) \
application(in.lsp_plug.lsp_plugins_mb_expander_mono.desktop) \
application(in.lsp_plug.lsp_plugins_mb_expander_ms.desktop) \
application(in.lsp_plug.lsp_plugins_mb_expander_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_mb_gate_lr.desktop) \
application(in.lsp_plug.lsp_plugins_mb_gate_mono.desktop) \
application(in.lsp_plug.lsp_plugins_mb_gate_ms.desktop) \
application(in.lsp_plug.lsp_plugins_mb_gate_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_mixer_x16_mono.desktop) \
application(in.lsp_plug.lsp_plugins_mixer_x16_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_mixer_x4_mono.desktop) \
application(in.lsp_plug.lsp_plugins_mixer_x4_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_mixer_x8_mono.desktop) \
application(in.lsp_plug.lsp_plugins_mixer_x8_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_multisampler_x12.desktop) \
application(in.lsp_plug.lsp_plugins_multisampler_x12_do.desktop) \
application(in.lsp_plug.lsp_plugins_multisampler_x24.desktop) \
application(in.lsp_plug.lsp_plugins_multisampler_x24_do.desktop) \
application(in.lsp_plug.lsp_plugins_multisampler_x48.desktop) \
application(in.lsp_plug.lsp_plugins_multisampler_x48_do.desktop) \
application(in.lsp_plug.lsp_plugins_noise_generator_x1.desktop) \
application(in.lsp_plug.lsp_plugins_noise_generator_x2.desktop) \
application(in.lsp_plug.lsp_plugins_noise_generator_x4.desktop) \
application(in.lsp_plug.lsp_plugins_oscillator_mono.desktop) \
application(in.lsp_plug.lsp_plugins_oscilloscope_x1.desktop) \
application(in.lsp_plug.lsp_plugins_oscilloscope_x2.desktop) \
application(in.lsp_plug.lsp_plugins_oscilloscope_x4.desktop) \
application(in.lsp_plug.lsp_plugins_para_equalizer_x16_lr.desktop) \
application(in.lsp_plug.lsp_plugins_para_equalizer_x16_mono.desktop) \
application(in.lsp_plug.lsp_plugins_para_equalizer_x16_ms.desktop) \
application(in.lsp_plug.lsp_plugins_para_equalizer_x16_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_para_equalizer_x32_lr.desktop) \
application(in.lsp_plug.lsp_plugins_para_equalizer_x32_mono.desktop) \
application(in.lsp_plug.lsp_plugins_para_equalizer_x32_ms.desktop) \
application(in.lsp_plug.lsp_plugins_para_equalizer_x32_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_phase_detector.desktop) \
application(in.lsp_plug.lsp_plugins_profiler_mono.desktop) \
application(in.lsp_plug.lsp_plugins_profiler_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_room_builder_mono.desktop) \
application(in.lsp_plug.lsp_plugins_room_builder_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_sampler_mono.desktop) \
application(in.lsp_plug.lsp_plugins_sampler_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_sc_compressor_lr.desktop) \
application(in.lsp_plug.lsp_plugins_sc_compressor_mono.desktop) \
application(in.lsp_plug.lsp_plugins_sc_compressor_ms.desktop) \
application(in.lsp_plug.lsp_plugins_sc_compressor_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_sc_dyna_processor_lr.desktop) \
application(in.lsp_plug.lsp_plugins_sc_dyna_processor_mono.desktop) \
application(in.lsp_plug.lsp_plugins_sc_dyna_processor_ms.desktop) \
application(in.lsp_plug.lsp_plugins_sc_dyna_processor_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_sc_expander_lr.desktop) \
application(in.lsp_plug.lsp_plugins_sc_expander_mono.desktop) \
application(in.lsp_plug.lsp_plugins_sc_expander_ms.desktop) \
application(in.lsp_plug.lsp_plugins_sc_expander_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_sc_gate_lr.desktop) \
application(in.lsp_plug.lsp_plugins_sc_gate_mono.desktop) \
application(in.lsp_plug.lsp_plugins_sc_gate_ms.desktop) \
application(in.lsp_plug.lsp_plugins_sc_gate_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_sc_limiter_mono.desktop) \
application(in.lsp_plug.lsp_plugins_sc_limiter_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_compressor_lr.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_compressor_mono.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_compressor_ms.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_compressor_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_dyna_processor_lr.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_dyna_processor_mono.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_dyna_processor_ms.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_dyna_processor_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_expander_lr.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_expander_mono.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_expander_ms.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_expander_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_gate_lr.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_gate_mono.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_gate_ms.desktop) \
application(in.lsp_plug.lsp_plugins_sc_mb_gate_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_slap_delay_mono.desktop) \
application(in.lsp_plug.lsp_plugins_slap_delay_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_spectrum_analyzer_x1.desktop) \
application(in.lsp_plug.lsp_plugins_spectrum_analyzer_x12.desktop) \
application(in.lsp_plug.lsp_plugins_spectrum_analyzer_x16.desktop) \
application(in.lsp_plug.lsp_plugins_spectrum_analyzer_x2.desktop) \
application(in.lsp_plug.lsp_plugins_spectrum_analyzer_x4.desktop) \
application(in.lsp_plug.lsp_plugins_spectrum_analyzer_x8.desktop) \
application(in.lsp_plug.lsp_plugins_surge_filter_mono.desktop) \
application(in.lsp_plug.lsp_plugins_surge_filter_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_trigger_midi_mono.desktop) \
application(in.lsp_plug.lsp_plugins_trigger_midi_stereo.desktop) \
application(in.lsp_plug.lsp_plugins_trigger_mono.desktop) \
application(in.lsp_plug.lsp_plugins_trigger_stereo.desktop) \
config(lsp-plugins) \
liblsp-plugins-jack-1.2.7.so()(64bit) \
lsp-plugins \
lsp-plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libfreetype.so.6()(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
lsp-plugins-common"

inherit rpm
