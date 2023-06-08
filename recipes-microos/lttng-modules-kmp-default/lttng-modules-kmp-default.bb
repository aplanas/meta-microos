SUMMARY = "Licensing information for package lttng-modules"
DESCRIPTION = "This package provides licensing documentation for the lttng kmp packages."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "2.13.8_k6.2.12_1"

RPM_NAME = "lttng-modules-kmp-default-2.13.8_k6.2.12_1-1.16.aarch64.rpm"
RPM_HASH = "8cd488a47a1f232a6f43dd34fbb58278df6318b696ac7fb500cea49880328094c4eea2673ff371d2aecf98d5e20edc8107ab8aab015e79fffea4888299197f1f"

RPROVIDES:${PN} += "kmod(lttng_clock.ko) kmod(lttng_clock_plugin_test.ko) kmod(lttng_counter.ko) kmod(lttng_counter_client_percpu_32_modular.ko) kmod(lttng_counter_client_percpu_64_modular.ko) kmod(lttng_kprobes.ko) kmod(lttng_kretprobes.ko) kmod(lttng_lib_ring_buffer.ko) kmod(lttng_probe_9p.ko) kmod(lttng_probe_asoc.ko) kmod(lttng_probe_block.ko) kmod(lttng_probe_gpio.ko) kmod(lttng_probe_i2c.ko) kmod(lttng_probe_irq.ko) kmod(lttng_probe_jbd2.ko) kmod(lttng_probe_kvm.ko) kmod(lttng_probe_module.ko) kmod(lttng_probe_napi.ko) kmod(lttng_probe_net.ko) kmod(lttng_probe_power.ko) kmod(lttng_probe_printk.ko) kmod(lttng_probe_rcu.ko) kmod(lttng_probe_regulator.ko) kmod(lttng_probe_sched.ko) kmod(lttng_probe_scsi.ko) kmod(lttng_probe_signal.ko) kmod(lttng_probe_skb.ko) kmod(lttng_probe_sock.ko) kmod(lttng_probe_statedump.ko) kmod(lttng_probe_sunrpc.ko) kmod(lttng_probe_timer.ko) kmod(lttng_probe_udp.ko) kmod(lttng_probe_vmscan.ko) kmod(lttng_probe_workqueue.ko) kmod(lttng_probe_writeback.ko) kmod(lttng_ring_buffer_client_discard.ko) kmod(lttng_ring_buffer_client_mmap_discard.ko) kmod(lttng_ring_buffer_client_mmap_overwrite.ko) kmod(lttng_ring_buffer_client_overwrite.ko) kmod(lttng_ring_buffer_event_notifier_client.ko) kmod(lttng_ring_buffer_metadata_client.ko) kmod(lttng_ring_buffer_metadata_mmap_client.ko) kmod(lttng_statedump.ko) kmod(lttng_test.ko) kmod(lttng_tracer.ko) kmod(lttng_uprobes.ko) kmod(lttng_wrapper.ko) lttng-modules-kmp lttng-modules-kmp-default lttng-modules-kmp-default(aarch-64) lttng-modules-kmp-default-k6.2.12_1 multiversion(kernel)"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-default kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
