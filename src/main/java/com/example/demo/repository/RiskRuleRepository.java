package com.example.demo.repository;

import com.example.demo.model.RiskRule;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RiskRuleRepository extends JpaRepository<RiskRule, Long> {
    // Used to check for duplicate rule names
    Optional<RiskRule> findByRuleName(String ruleName);
}
