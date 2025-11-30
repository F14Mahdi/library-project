package ir.maktabsharif.library.service.Impl;

import ir.maktabsharif.library.model.Member;
import ir.maktabsharif.library.service.MemberService;

import java.util.List;
import java.util.Optional;

public class MemberImpl implements MemberService {
    @Override
    public Member save(Member entity) {
        return null;

    }

    @Override
    public Optional<Member> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public List<Member> findAll() {
        return List.of();
    }

    @Override
    public Member update(Member entity,Long id) {
        return null;

    }
}
